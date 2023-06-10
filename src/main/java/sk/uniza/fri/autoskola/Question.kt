package sk.uniza.fri.autoskola

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import sk.uniza.fri.autoskola.databinding.QuestionBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Question : Fragment() {
    data class QuestionInfo(val question : String, val answers : List<String>, val correct : Int)

    private val questions: MutableList<QuestionInfo> = mutableListOf(
        QuestionInfo(question = "Čo je križovatka ?",
            answers = listOf("Spájanie ciest", "Niečo", "Niečo", "Niečo"),
            correct = 0),
        QuestionInfo(question = "Čo je to zastavenie vozidla ?",
            answers = listOf("Niečo", "Zastavenie nezávislé od vodiča.", "Niečo", "Niečo"),
            correct = 1)
    )

    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: QuestionBinding? = null;
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = DataBindingUtil.inflate<QuestionBinding>(inflater, R.layout.question, container, false)

        _binding!!.question = questions[0];

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}