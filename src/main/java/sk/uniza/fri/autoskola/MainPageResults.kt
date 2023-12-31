package sk.uniza.fri.autoskola

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sk.uniza.fri.autoskola.data.TestResultDatabase
import sk.uniza.fri.autoskola.databinding.MainPageResultsBinding

class MainPageResults : Fragment() {

    //private var _results: MutableList<TestResult> = ArrayList();
    private lateinit var _recyclerView: RecyclerView

    private var _binding: MainPageResultsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = MainPageResultsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //_results.add(TestResult(82, 100, 0, false))
        //_results.add(TestResult(93, 100, 0))

        val results = TestResultDatabase.getDB(requireContext()).dao.getResults()
        //var results: List<TestResult> = ArrayList()

        _recyclerView = view.findViewById(R.id.tests_recycler)!!

        val adapter = context?.let { RecyclerAdapter(it, results) }
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        _recyclerView.layoutManager = layoutManager
        _recyclerView.itemAnimator = DefaultItemAnimator()
        _recyclerView.adapter = adapter

        results.observe(viewLifecycleOwner) {
            it?.let {
                adapter?.notifyDataSetChanged()
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}