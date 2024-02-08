package com.gunay.navigation_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation

import com.gunay.navigation_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var navigationController : NavController



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)




        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        navigationController= navHostFragment.navController
        NavigationUI.setupActionBarWithNavController(this,navigationController)


    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navigationController,null)
    }


}