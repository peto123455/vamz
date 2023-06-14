package sk.uniza.fri.autoskola

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import sk.uniza.fri.autoskola.data.Questions
import sk.uniza.fri.autoskola.data.TestResult
import sk.uniza.fri.autoskola.data.TestResultDatabase
import sk.uniza.fri.autoskola.databinding.TestBinding
import java.time.LocalDateTime


class Test : Fragment() {
    //data class QuestionInfo(val question : String, val answers : List<String>, val correct : Int, val points: Int = 1)

    private val _questions: MutableList<Questions.Question> = ArrayList()

    private var _binding: TestBinding? = null
    private var _answered: Int = 0
    private var _answeredCorrectly: Int = 0
    private var _points: Int = 0
    private var _minimumPoints: Int = 90

    private val binding get() = _binding!!
    val answered get() = _answered
    val points get() = _points
    val questions get() = _questions

    /**
     * Adds points to the score
     * @param points The amount of points to be added
     */
    fun addPoints(points: Int) {
        ++_answeredCorrectly
        _points += points
    }

    /**
     * Called when an answer was answered
     */
    fun answered() {
        ++_answered
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = TestBinding.inflate(inflater, container, false)

        testInit()

        childFragmentManager.beginTransaction().add(R.id.testholder, TestQuestion()).commit()

        return binding.root
    }

    /**
     * Initializes the test
     */
    private fun testInit() {
        _questions.clear()
        _questions.addAll((activity as MainActivity).generateQuestions)

        _minimumPoints = (getMaxPoints().toDouble() / 0.9).toInt()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /**
     * Gets a formatted test result string
     * @return Formatted string
     */
    fun getScoreText(): String {
        return String.format("Správne: %d/%d\nBody: %d/%d", _answeredCorrectly, questions.size, points, getMaxPoints())
    }

    /**
     * Returns the maximum amount of points possible
     * @return Max points
     */
    private fun getMaxPoints(): Int {
        var total = 0

        for (question in questions) {
            total += question.category.points
        }

        return total
    }

    /**
     * Finishes the test
     */
    fun finish() {
        val result = TestResult()

        runBlocking {
            launch {
                TestResultDatabase.getDB(requireContext()).dao.upsertResult(TestResult(_points, getMaxPoints(), TestResult.fromDate(LocalDateTime.now()), points >= _minimumPoints))
            }
        }

        childFragmentManager.beginTransaction().replace(R.id.testholder, result).commit()
    }
}