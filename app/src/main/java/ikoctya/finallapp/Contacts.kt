package ikoctya.finallapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Contacts : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contacts, container, false)
        //+++вызов звонилки
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:+79996660099"))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        val supportButton: Button = view.findViewById(R.id.supportButton)
        supportButton.setOnClickListener { this.startActivity(intent) }
        //---вызов звонилки
        return view
    }
}