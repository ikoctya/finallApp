package ikoctya.finallapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Channels : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_channels, container, false)
        //    activity?.supportFragmentManager
        //            ?.beginTransaction()
        //            ?.replace(R.id.fragment_container, ta)
        //            ?.commit()

        return view
    }
}

