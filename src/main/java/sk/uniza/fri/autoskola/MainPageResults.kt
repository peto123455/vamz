package sk.uniza.fri.autoskola

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sk.uniza.fri.autoskola.databinding.MainPageResultsBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

class MainPageResults : Fragment() {

    private var _results: MutableList<TestResult> = ArrayList();
    private lateinit var _recyclerView: RecyclerView

    private var _binding: MainPageResultsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = MainPageResultsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _results.add(TestResult(82, 100, LocalDateTime.now(), false))
        _results.add(TestResult(93, 100, LocalDateTime.now()))

        _recyclerView = view?.findViewById(R.id.tests_recycler)!!

        var adapter = context?.let { RecyclerAdapter(it, _results) }
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        _recyclerView.layoutManager = layoutManager
        _recyclerView.itemAnimator = DefaultItemAnimator()
        _recyclerView.adapter = adapter
        //adapter?.notifyDataSetChanged()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}