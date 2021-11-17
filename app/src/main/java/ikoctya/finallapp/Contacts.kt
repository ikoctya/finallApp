package ikoctya.finallapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Contacts : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contacts, container, false)
        //    activity?.supportFragmentManager
        //            ?.beginTransaction()
        //            ?.replace(R.id.fragment_container, ta)
        //            ?.commit()
        return view
    }
}