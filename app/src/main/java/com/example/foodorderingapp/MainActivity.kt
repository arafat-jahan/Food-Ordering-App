package com.example.foodorderingapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the NavController from the fragment container view
        val navController = findNavController(R.id.fragmentContainerView2)

        // Find the BottomNavigationView by its ID
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Setup BottomNavigationView with NavController
        bottomNav.setupWithNavController(navController)
    }
}
