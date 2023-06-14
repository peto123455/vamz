package sk.uniza.fri.autoskola

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import sk.uniza.fri.autoskola.databinding.TestResultBinding

class TestResult : Fragment() {

    private var _binding: TestResultBinding? = null
    private val binding get() = _binding!!
    private val _parent get() = (parentFragment as Test)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = DataBindingUtil.inflate(inflater,
            R.layout.test_result, container, false)

        setView()

        return binding.root
    }

    private fun setView() {
        _binding!!.test = _parent

        _binding!!.resultImage.setImageDrawable(ResourcesCompat.getDrawable(resources, if (_parent.isSuccessful) R.drawable.check else R.drawable.cross, null))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}