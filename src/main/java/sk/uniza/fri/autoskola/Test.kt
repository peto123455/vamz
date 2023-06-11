package sk.uniza.fri.autoskola

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import sk.uniza.fri.autoskola.databinding.TestBinding


class Test : Fragment() {
    data class QuestionInfo(val question : String, val answers : List<String>, val correct : Int)

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
    private var _points: Int = 0

    private val binding get() = _binding!!
    val answered get() = _answered
    val points get() = _points
    val questions get() = _questions

    fun addPoints(points: Int) {
        _points += points;
    }

    fun answered() {
        ++_answered;
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = TestBinding.inflate(inflater, container, false)

        val manager: FragmentManager = childFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.testholder, Question())
        transaction.commit()

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
        return String.format("%d/%d", points, 55)
    }

    fun finish() {
        val result = Result();

        childFragmentManager.beginTransaction().replace(R.id.testholder, result).addToBackStack(null).commit()
    }
}