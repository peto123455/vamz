package sk.uniza.fri.autoskola

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import sk.uniza.fri.autoskola.Result
import sk.uniza.fri.autoskola.databinding.TestQuestionBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Question : Fragment() {

    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: TestQuestionBinding? = null
    private var _currentQuestion: Test.QuestionInfo? = null
    private val binding get() = _binding!!
    val currentQuestion get() = _currentQuestion!!
    private val _parent get() = (parentFragment as Test)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = DataBindingUtil.inflate<TestQuestionBinding>(inflater, R.layout.test_question, container, false)

        //_binding!!.question = questions[0]
        _binding!!.question = this
        _currentQuestion = _parent.questions[0]

        return binding.root
    }

    fun selectAnswer(index: Int) {
        if (_currentQuestion == null) return

        _parent.answered()
        if (index == _currentQuestion!!.correct) _parent.addPoints(_currentQuestion!!.points);

        if (_parent.questions.size < _parent.answered + 1) {
            _currentQuestion = null;
            _parent.finish()
            return
        }

        _currentQuestion = _parent.questions[_parent.answered]
        _binding!!.invalidateAll()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}