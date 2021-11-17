package ikoctya.finallapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tariffs : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_tariffs, container, false)
        //activity?.supportFragmentManager
        //        ?.beginTransaction()
        //        ?.replace(R.id.fragment_container, )
        //       ?.commit()

           return view
    }

}

