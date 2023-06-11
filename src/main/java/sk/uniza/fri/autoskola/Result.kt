package sk.uniza.fri.autoskola

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import sk.uniza.fri.autoskola.databinding.TestResultBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Result : Fragment() {

    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: TestResultBinding? = null
    private val binding get() = _binding!!
    private val _parent get() = ((parentFragment as NavHostFragment).parentFragment as Test)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = DataBindingUtil.inflate<TestResultBinding>(inflater, R.layout.test_result, container, false)

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