package com.example.foodorderingapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderingapp.databinding.PopulerItemBinding

class PopularAdapter(
    private val items: List<String>,
    private val price: List<String>,
    private val image: List<Int>
) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    // Creates new view holders (item views)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        // Inflates the item layout and creates a view holder
        return PopularViewHolder(
            PopulerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    // Binds data (food name, price, and image) to each view holder
    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val itemName = items[position]      // Get the food name
        val itemImage = image[position]     // Get the image resource
        val itemPrice = price[position]     // Get the price
        // Bind the data to the view holder
        holder.bind(itemName, itemPrice, itemImage)
    }

    // Returns the total number of items
    override fun getItemCount(): Int {
        return items.size
    }

    // ViewHolder class that holds references to the views in each item layout
    class PopularViewHolder(private val binding: PopulerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        // Bind data to the views
        fun bind(item: String, itemPrice: String, imageRes: Int) {
            binding.foodNamePopuler.text = item                 // Set the food name
            binding.pricePopuler.text = itemPrice               // Set the food price
            binding.imageView5.setImageResource(imageRes)       // Set the image resource
        }
    }
}
