package ikoctya.finallapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomMenu: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = "ВАШ ЛЮБИМЫЙ ПРОВАЙДЕР"

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




    }

    override fun onSaveInstanceState(outState: Bundle) {
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