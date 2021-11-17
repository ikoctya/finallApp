package ikoctya.finallapp

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.get

class Contacts : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contacts, container, false)

        val permissionStatus =
          ContextCompat.checkSelfPermission(inflater.context, Manifest.permission.CALL_PHONE)
        if (permissionStatus == PackageManager.PERMISSION_GRANTED) {
           // super.finish
        } else {
            ActivityCompat.requestPermissions(
                this  , arrayOf(Manifest.permission.CALL_PHONE),1
            )
        }

        val intent = Intent(Intent.ACTION_CALL,Uri.parse("tel:+79996660099"))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        val supportButton:Button= view.findViewById(R.id.supportButton)
        supportButton.setOnClickListener { this.startActivity(intent) }

     //   val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:+79508200143"))
   //     startActivity(intent)

        return view
    }
}