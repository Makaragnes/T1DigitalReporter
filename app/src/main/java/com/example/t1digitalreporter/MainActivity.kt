package com.example.t1digitalreporter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewbinding.ViewBindings
import com.example.t1digitalreporter.databinding.ActivityMainBinding
import com.example.t1digitalreporter.databinding.ActivityMainBinding.*
import com.example.t1digitalreporter.objects.AppDrawer
import com.example.t1digitalreporter.utilits.APP_ACTIVITY
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var mBindings: ActivityMainBinding
    lateinit var mToolBar: Toolbar
    lateinit var mAppDrawer: AppDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBindings = inflate(layoutInflater)
        setContentView(mBindings.root)
        APP_ACTIVITY = this

        initFields()
        initFunc()


    }

    private fun initFunc() {
        /* Функция инициализирует функциональность приложения */
        setSupportActionBar(mToolBar)
//        if (AUTH.currentUser != null) {
//            mAppDrawer.create()
//            //replaceFragment(MainListFragment(), false)
//        } else {
//            //replaceFragment(EnterPhoneNumberFragment(),false)
//        }
    }

    private fun initFields() {
        /* Функция инициализирует переменные */
        mToolBar = mBindings.mainToolbar
        mAppDrawer = AppDrawer()
    }
}