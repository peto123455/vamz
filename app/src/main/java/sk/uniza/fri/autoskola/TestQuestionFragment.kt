package sk.uniza.fri.autoskola

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import sk.uniza.fri.autoskola.data.Questions
import sk.uniza.fri.autoskola.databinding.TestQuestionBinding

class TestQuestionFragment : Fragment() {

    private var _binding: TestQuestionBinding? = null
    private var _currentQuestion: Questions.Question? = null
    private var _timer: CountDownTimer? = null
    private val binding get() = _binding!!
    val currentQuestion get() = _currentQuestion!!
    private val _parent get() = (parentFragment as TestFragment)

    private var answered = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)

        _binding = DataBindingUtil.inflate(inflater,
            R.layout.test_question, container, false)

        startTest()

        return binding.root
    }


    /**
     * Starts the test
     */
    private fun startTest() {
        _binding!!.question = this
        _currentQuestion = _parent.questions[0]
        _binding?.buttonNext?.isEnabled = false
        _timer = object: CountDownTimer(1800000, 1000) {
            override fun onTick(p0: Long) {
                setTimerText(p0)
            }

            override fun onFinish() {
                _parent.finish()
            }
        }

        (_timer as CountDownTimer).start()

        updateQuestion()
        resetButtonColors()
    }

    /**
     * Updates the UI of the question
     */
    private fun updateQuestion() {
        if (_currentQuestion!!.image == "") {
            _binding!!.questionImage.visibility = View.INVISIBLE
        } else {
            _binding!!.questionImage.setImageResource(activity?.resources!!.getIdentifier(_currentQuestion!!.image, "drawable", activity?.packageName))
            _binding!!.questionImage.visibility = View.VISIBLE
        }

        _binding!!.invalidateAll()
    }

    /**
     * Returns text for Next Question button
     * @param index Next question string
     */
    fun nextQuestionString(): String {
        if (_parent.questions.size <= _parent.answered + 1) return getString(R.string.endTest)
        return getString(R.string.nextQuestion)
    }

    /**
     * Called when user selects an answer
     * @param index Index of the selected answer
     */
    fun selectAnswer(index: Int) {
        if (_currentQuestion == null || answered) return

        if (index == _currentQuestion!!.answer) _parent.addPoints(_currentQuestion!!.category.points)
        _parent.answered()
        answered = true

        revealAnswer(index)

        _binding?.buttonNext?.isEnabled = true
    }

    /**
     * Reveals the correct answer
     */
    private fun revealAnswer(index: Int) {
        getButtonByIndex(index)?.setBackgroundColor(resources.getColor(R.color.red, null))
        getButtonByIndex(_currentQuestion!!.answer)?.setBackgroundColor(resources.getColor(R.color.green, null))
    }

    /**
     * Resets the button color. (After an answer was revealed)
     */
    private fun resetButtonColors() {
        for (i in 1..3) getButtonByIndex(i)!!.setBackgroundColor(resources.getColor(R.color.babyBlue, null))
    }

    /**
     * Gets a button by its index
     * @param index Index of the Button
     * @return Button with the index
     */
    private fun getButtonByIndex(index: Int): Button? {
        return when (index) {
            1 -> _binding!!.buttonA
            2 -> _binding!!.buttonB
            3 -> _binding!!.buttonC

            else -> null
        }
    }

    /**
     * Handles transition to the next question / end of the test.
     */
    fun nextQuestion() {
        if (_currentQuestion == null) return

        answered = false
        resetButtonColors()

        if (_parent.questions.size < _parent.answered + 1) {
            _currentQuestion = null
            _parent.finish()
            return
        }

        _currentQuestion = _parent.questions[_parent.answered]

        updateQuestion()
        _binding?.buttonNext?.isEnabled = false
    }

    override fun onDestroyView() {
        super.onDestroyView()
        (_timer as CountDownTimer).cancel()
        _binding = null
    }

    /**
     * Returns formatted question number.
     * @return Formatted string
     */
    fun getNumberString(): String {
        return String.format("Otázka: %d / %d", _parent.answered + 1, _parent.questions.size)
    }

    /**
     * Returns formatted timer.
     * @return Formatted string
     */
    fun setTimerText(time: Long) {
        val seconds: Long = time / 1000
        _binding!!.questionTimer.text = String.format("%02d:%02d", seconds / 60, seconds % 60)
    }
}