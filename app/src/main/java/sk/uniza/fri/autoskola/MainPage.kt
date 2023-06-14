package sk.uniza.fri.autoskola

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import sk.uniza.fri.autoskola.data.Questions
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
            val builder = AlertDialog.Builder(context)
            builder.setTitle("Vyber druh testu")
            val types: MutableList<String> = ArrayList()
            types.add("Oficiálny náhodne generovaný test")

            for (category in (activity as MainActivity).getCategories) {
                types.add(category.name)
            }

            builder.setItems(types.toTypedArray()) { dialog, which ->
                dialog.dismiss()
                (activity as MainActivity).setCategory(which - 1)
                findNavController().navigate(R.id.action_MainPage_to_test)
            }

            builder.show()
        }

        childFragmentManager.beginTransaction().replace(R.id.tests_frame, MainPageResults()).commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}