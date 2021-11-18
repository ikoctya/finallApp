package ikoctya.finallapp

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "item"

class MainActivity : AppCompatActivity() {
    private lateinit var bottomMenu: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = "ВАШ ЛЮБИМЫЙ ПРОВАЙДЕР"

        //+++запрос разрешений на звонилку
        val permissionStatus =
            ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
        if (permissionStatus == PackageManager.PERMISSION_GRANTED) {
            //здорово
        } else {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 1)
        }
        //---запрос разрешений на звонилку

        //+++Меню внизу
        bottomMenu = findViewById(R.id.bottomMenu)
        bottomMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_tariffs -> {
                    val tariffsFragment = Tariffs()
                    ReplaceFragment(tariffsFragment)
                }
                R.id.menu_contacts -> {
                    val contactsFragment = Contacts()
                    ReplaceFragment(contactsFragment)
                }
                R.id.menu_tv -> {
                    val tvFragment = Channels()
                    ReplaceFragment(tvFragment)
                }
            }
            true
        }
        //---Меню внизу

        //восстанавливаем экран, при отсутствии сохранения загружаем menu_tariffs
        bottomMenu.selectedItemId = savedInstanceState?.getInt(
            LAST_SELECTED_ITEM
        ) ?: R.id.menu_tariffs
    }

    //сохраняемся
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }

    //+++процедура смены фрагмента
    private fun ReplaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
    //---процедура смены фрагмента


}