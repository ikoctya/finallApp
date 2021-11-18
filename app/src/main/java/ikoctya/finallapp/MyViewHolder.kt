package ikoctya.finallapp

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(banner:SrcPicture){
        val bannerImageView: ImageView =itemView.findViewById(R.id.tariff_banner)
        bannerImageView.setImageDrawable(itemView.context.getDrawable(banner.numb))
    }
}