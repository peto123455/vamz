package sk.uniza.fri.autoskola

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
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
    private val binding get() = _binding!!
    val currentQuestion get() = _currentQuestion!!
    private val _parent get() = (parentFragment as Test)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = DataBindingUtil.inflate<TestQuestionBinding>(inflater, R.layout.test_question, container, false)

        //_binding!!.question = questions[0]
        _binding!!.question = this
        _currentQuestion = _parent.questions[0]

        updateQuestion()

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
        if (_currentQuestion == null) return

        _parent.answered()
        if (index == _currentQuestion!!.answer) _parent.addPoints(_currentQuestion!!.category.points);

        if (_parent.questions.size < _parent.answered + 1) {
            _currentQuestion = null;
            _parent.finish()
            return
        }

        _currentQuestion = _parent.questions[_parent.answered]

        updateQuestion()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}