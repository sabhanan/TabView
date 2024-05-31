package com.example.mainapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tab = findViewById<TabLayout>(R.id.frameLayout)
        var fragment : Fragment = PplgFragment()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
                when(tab!!.position){
                    0 -> fragment = PplgFragment()
                    1 -> fragment = KulinerFragment()
                    2 -> fragment = ToFragment()
                    3 -> fragment = TpflFragment()
                    4 -> fragment = BusanaFragment()
                }
                val fT = supportFragmentManager.beginTransaction()
                fT.replace(R.id.frameLayout, fragment)
                fT.replace()
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {

            }
        })
    }
}