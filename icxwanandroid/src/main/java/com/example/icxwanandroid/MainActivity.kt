package com.example.icxwanandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v7.app.ActionBarDrawerToggle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.example.icxwanandroid.fragment.HomeFragment
import com.example.icxwanandroid.fragment.HotFragment
import com.example.icxwanandroid.fragment.KonwledgeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //因为Kotlin会使用null来对每一个用lateinit修饰的属性做初始化，而基础类型是没有null类型，所以无法使用lateinit
    //private lateinit var a : Int , 要改成

    private var homeFragment : HomeFragment = HomeFragment()
    private var konwledgeFragment : KonwledgeFragment = KonwledgeFragment()
    private var hotFragment : HotFragment = HotFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.run {
            setSupportActionBar(this)
        }

        drawer.run {
            var toggle = ActionBarDrawerToggle(
                this@MainActivity,
                this,
                toolbar,
                R.string.my_like,
                R.string.my_about
            )
            addDrawerListener(toggle)
            toggle.syncState()

        }

        navigationview.run{
            setNavigationItemSelectedListener(onDrawerNavigationItemSelectedListener)
        }

        bottom_navigation.run {
            setOnNavigationItemSelectedListener(bottomNavigationSelectedListener)
        }

        if(supportFragmentManager.fragments.size == 0){
            supportFragmentManager.beginTransaction().add(R.id.fl_container , homeFragment).commitAllowingStateLoss()
            supportFragmentManager.beginTransaction().add(R.id.fl_container , konwledgeFragment).commitAllowingStateLoss()
            supportFragmentManager.beginTransaction().add(R.id.fl_container , hotFragment).commitAllowingStateLoss()
            supportFragmentManager.beginTransaction().hide(konwledgeFragment).commitAllowingStateLoss()
            supportFragmentManager.beginTransaction().hide(hotFragment).commitAllowingStateLoss()

        }

    }


    private val onDrawerNavigationItemSelectedListener =
            NavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.nav_like -> {
                    }

                    R.id.nav_about -> {
                    }
                }
                true
    }

    private val bottomNavigationSelectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.navigation_home -> {
                        if (bottom_navigation.selectedItemId != R.id.navigation_home) {
                            supportFragmentManager.beginTransaction().show(homeFragment).commitAllowingStateLoss()
                            supportFragmentManager.beginTransaction().hide(konwledgeFragment).commitAllowingStateLoss()
                            supportFragmentManager.beginTransaction().hide(hotFragment).commitAllowingStateLoss()
                            toolbar.title = getString(R.string.app_name)
                        }
                    }

                    R.id.navigation_type -> {
                        if (bottom_navigation.selectedItemId != R.id.navigation_type) {
                            supportFragmentManager.beginTransaction().show(konwledgeFragment).commitAllowingStateLoss()
                            supportFragmentManager.beginTransaction().hide(homeFragment).commitAllowingStateLoss()
                            supportFragmentManager.beginTransaction().hide(hotFragment).commitAllowingStateLoss()
                            toolbar.title = getString(R.string.Konwledge)
                        }
                    }
                    R.id.mine -> {
                        if (bottom_navigation.selectedItemId != R.id.mine) {
                            supportFragmentManager.beginTransaction().show(hotFragment).commitAllowingStateLoss()
                            supportFragmentManager.beginTransaction().hide(homeFragment).commitAllowingStateLoss()
                            supportFragmentManager.beginTransaction().hide(konwledgeFragment).commitAllowingStateLoss()
                            toolbar.title = getString(R.string.hot)
                        }
                    }
                }
                true
            }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.search -> {
//                startActivity(Intent(this, SearchActivity::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
