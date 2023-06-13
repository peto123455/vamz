package sk.uniza.fri.autoskola

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import sk.uniza.fri.autoskola.databinding.TestQuestionBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class TestQuestion : Fragment() {

    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: TestQuestionBinding? = null
    private var _currentQuestion: Questions.Question? = null
    private var _timer: CountDownTimer? = null
    private val binding get() = _binding!!
    val currentQuestion get() = _currentQuestion!!
    private val _parent get() = (parentFragment as Test)

    private var answered = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = DataBindingUtil.inflate<TestQuestionBinding>(inflater, R.layout.test_question, container, false)

        //_binding!!.question = questions[0]
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

        return binding.root
    }

    private fun updateQuestion() {
        if (_currentQuestion!!.image == "") {
            _binding!!.questionImage.visibility = View.INVISIBLE
        } else {
            _binding!!.questionImage.setImageResource(activity?.resources!!.getIdentifier(_currentQuestion!!.image, "drawable", activity?.packageName))
            _binding!!.questionImage.visibility = View.VISIBLE
        }
        _binding!!.invalidateAll()
    }

    fun selectAnswer(index: Int) {
        if (_currentQuestion == null || answered) return

        if (index == _currentQuestion!!.answer) _parent.addPoints(_currentQuestion!!.category.points);
        _parent.answered()
        answered = true

        revealAnswer(index)

        _binding?.buttonNext?.isEnabled = true
    }

    private fun revealAnswer(index: Int) {
        getButtonByIndex(index)?.setBackgroundColor(resources.getColor(R.color.red, null))
        getButtonByIndex(_currentQuestion!!.answer)?.setBackgroundColor(resources.getColor(R.color.green, null))
    }

    private fun resetButtonColors() {
        for (i in 1..3) getButtonByIndex(i)!!.setBackgroundColor(resources.getColor(R.color.babyBlue, null));
    }

    private fun getButtonByIndex(index: Int): Button? {
        return when (index) {
            1 -> _binding!!.buttonA
            2 -> _binding!!.buttonB
            3 -> _binding!!.buttonC

            else -> null
        }
    }

    fun nextQuestion() {
        if (_currentQuestion == null) return

        answered = false
        resetButtonColors()

        if (_parent.questions.size < _parent.answered + 1) {
            _currentQuestion = null;
            _parent.finish()
            return
        }

        _currentQuestion = _parent.questions[_parent.answered]

        updateQuestion()
        _binding?.buttonNext?.isEnabled = false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        (_timer as CountDownTimer).cancel()
        _binding = null
    }

    fun getNumberString(): String {
        return String.format("Otázka: %d / %d", _parent.answered + 1, _parent.questions.size)
    }

    fun setTimerText(time: Long) {
        val seconds: Long = time / 1000
        _binding!!.questionTimer.text = String.format("%02d:%02d", seconds / 60, seconds % 60)
    }
}