package recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pract15.R

class StateRecycler (val context: Context, val list: ArrayList<State>) : RecyclerView.Adapter<StateRecycler.MyVH>() {

    class MyVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.state_image)
        val headerTitle: TextView = itemView.findViewById(R.id.header_title)
        val textDescription: TextView = itemView.findViewById(R.id.state_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: StateRecycler.MyVH, position: Int) {
        holder.image.setImageResource(list[position].imageState)
        holder.headerTitle.setText(list[position].title)
        holder.textDescription.setText(list[position].textState)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}