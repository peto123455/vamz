package sk.uniza.fri.autoskola

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

class RecyclerAdapter(context: Context, list: LiveData<List<TestResult>>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var _tests: LiveData<List<TestResult>> = list;
    private var _context: Context = context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var _title: TextView = view.findViewById(R.id.item_title)
        private var _date: TextView = view.findViewById(R.id.item_date)
        private var _image: ImageView = view.findViewById(R.id.result_image)
        private var _removeButton: ImageButton = view.findViewById(R.id.removeButton)

        val title get() = _title
        val date get() = _date
        val image get() = _image
        val removeButton get() = _removeButton
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        //return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
        return ViewHolder(LayoutInflater.from(_context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val result = _tests.value?.get(position)

        if (result != null) {
            val date = TestResult.toDate(result.date)

            holder.title.text = String.format("Výsledok: %d/%d", result.points, result.outOf)
            holder.date.text = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))



            holder.removeButton.setOnClickListener(View.OnClickListener {
                runBlocking {
                    launch {
                        TestResultDatabase.getDB(_context).dao.deleteResult(result)
                    }
                }
            })

            if (!result.successful) {
                holder.image.setImageResource(R.drawable.cross)
            }
        }
    }

    override fun getItemCount(): Int {
        if (_tests.value == null) return 0;
        return _tests.value?.size!!;
    }
}