package sk.uniza.fri.autoskola

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(context: Context, list: MutableList<TestResult>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var _tests: MutableList<TestResult> = list;
    private var _context: Context = context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var _title: TextView = view.findViewById(R.id.item_title)
        private var _date: TextView = view.findViewById(R.id.item_date)
        private var _image: ImageView = view.findViewById(R.id.result_image)

        val title get() = _title
        val date get() = _date
        val image get() = _image
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        //return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
        return ViewHolder(LayoutInflater.from(_context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        var result = _tests.get(position)

        holder.title.text = String.format("Výsledok: %d/%d", result.points, result.outOf)
        holder.date.text = String.format("11.6.2023 17:00")

        if (!result.successful) {
            holder.image.setImageResource(R.drawable.cross)
        }
    }

    override fun getItemCount(): Int {
        return _tests.size;
    }
}