package sk.uniza.fri.autoskola

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import sk.uniza.fri.autoskola.databinding.MainPageBinding

class MainPage : Fragment() {

    private var _binding: MainPageBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = MainPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startTestButton.setOnClickListener {
            findNavController().navigate(R.id.action_MainPage_to_test)
        }

        childFragmentManager.beginTransaction().replace(R.id.tests_frame, MainPageResults()).commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}