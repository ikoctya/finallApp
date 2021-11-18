package ikoctya.finallapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tariffs : Fragment() {

    val tariffList: List<SrcPicture> = listOf(
        SrcPicture(R.drawable.tarif01, "tarif01"),
        SrcPicture(R.drawable.tarif02, "tarif02"),
        SrcPicture(R.drawable.tarif03, "tarif03"),
        SrcPicture(R.drawable.tarif04, "tarif04"),
        SrcPicture(R.drawable.tarif05, "tarif05"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_tariffs, container, false)
        val cardsRecyclerView: RecyclerView = view.findViewById(R.id.my_recycler)
        cardsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        cardsRecyclerView.adapter = MyAdapter(tariffList)
        return view
    }




}
