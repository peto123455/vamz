package sk.uniza.fri.autoskola

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import sk.uniza.fri.autoskola.databinding.TestBinding
import java.time.LocalDateTime


class Test : Fragment() {
    //data class QuestionInfo(val question : String, val answers : List<String>, val correct : Int, val points: Int = 1)

    private val _questions: MutableList<Questions.Question> = ArrayList()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: TestBinding? = null
    private var _answered: Int = 0
    private var _answeredCorrectly: Int = 0
    private var _points: Int = 0

    private val binding get() = _binding!!
    val answered get() = _answered
    val answeredCorrectly get() = _answeredCorrectly
    val points get() = _points
    val questions get() = _questions

    fun addPoints(points: Int) {
        ++_answeredCorrectly;
        _points += points;
    }

    fun answered() {
        ++_answered;
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = TestBinding.inflate(inflater, container, false)

        startTest()

        childFragmentManager.beginTransaction().add(R.id.testholder, TestQuestion()).commit()

        return binding.root
    }

    fun startTest() {
        _questions.clear()
        _questions.addAll((activity as MainActivity).generateQuestions)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun getScoreText(): String {
        return String.format("Správne: %d/%d\nBody: %d/%d", _answeredCorrectly, questions.size, points, getMaxPoints())
    }

    fun getMaxPoints(): Int {
        var total = 0;

        for (question in questions) {
            total += question.category.points;
        }

        return total
    }

    fun finish() {
        val result = Result();

        val db = TestResultDatabase.getDB(requireContext())

        runBlocking {
            launch {
                TestResultDatabase.getDB(requireContext()).dao.upsertResult(TestResult(_points, 100, LocalDateTime.now().toString(), true))
            }
        }

        childFragmentManager.beginTransaction().replace(R.id.testholder, result).commit()
    }
}