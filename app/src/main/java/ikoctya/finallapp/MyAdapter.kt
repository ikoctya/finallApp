package ikoctya.finallapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val tariffList: List<SrcPicture>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var cardView= LayoutInflater.from(parent.context)
            .inflate(R.layout.card_tariffs,parent,false)
        return MyViewHolder(cardView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val banner = tariffList[position]
        holder.bind(banner)
    }
    override fun getItemCount(): Int {
        return tariffList.size
    }
}