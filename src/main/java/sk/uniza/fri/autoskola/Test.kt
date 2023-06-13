package sk.uniza.fri.autoskola

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import sk.uniza.fri.autoskola.databinding.TestBinding
import java.time.LocalDateTime
import java.util.Date


class Test : Fragment() {
    data class QuestionInfo(val question : String, val answers : List<String>, val correct : Int, val points: Int = 1)

    private val _questions: MutableList<QuestionInfo> = mutableListOf(
        QuestionInfo(question = "Čo je križovatka ?",
            answers = listOf("Spájanie ciest", "Niečo", "Niečo", "Niečo"),
            correct = 0),
        QuestionInfo(question = "Čo je to zastavenie vozidla ?",
            answers = listOf("Niečo", "Zastavenie nezávislé od vodiča.", "Niečo", "Niečo"),
            correct = 1),
        QuestionInfo(question = "Test ?",
            answers = listOf("Niečo", "Niečo", "Ano", "Niečo"),
            correct = 2)
    )

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

        childFragmentManager.beginTransaction().add(R.id.testholder, Question()).commit()

        return binding.root
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
            total += question.points;
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