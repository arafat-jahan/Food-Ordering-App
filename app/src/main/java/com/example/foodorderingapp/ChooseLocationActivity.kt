// Package name declaration
package com.example.foodorderingapp

// Import necessary Android libraries
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.foodorderingapp.databinding.ActivityChooseLocationBinding

// Define the activity class
class ChooseLocationActivity : AppCompatActivity() {
    // Use View Binding to connect with the layout
    private val binding: ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)  // Set the content view to the layout using binding

        // Updated list of locations for the dropdown
        val locationList: Array<String> = arrayOf("Uttara", "Dhanmondi", "Savar", "Mohammodpur")

        // Create an ArrayAdapter to handle the data in the AutoCompleteTextView
        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            locationList
        )

        // Set the adapter to the AutoCompleteTextView to populate the dropdown list
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}
