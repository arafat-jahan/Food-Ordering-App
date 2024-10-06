package com.example.foodorderingapp

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.foodorderingapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment using view binding
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Create a list of images for the slider
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner, ScaleTypes.FIT))

        // Set the image list to the slider
        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)

        // Handle image item click events
        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }
        })

        // Set up the RecyclerView for popular items
        val item = listOf("Burger", "Sandwich", "Momo", "Item")
        val price = listOf("$5", "$7", "$8", "$10")
        val popularFoodImages = listOf(
            R.drawable.menu1, R.drawable.menu2, R.drawable.menu3, R.drawable.menu4
        )

        val adapter = PopularAdapter(item, price, popularFoodImages)
        binding.PopulerRecylerView.layoutManager = LinearLayoutManager(requireContext())
        binding.PopulerRecylerView.adapter = adapter
    }

    companion object {
        // You can add static-like functionality here if needed
    }
}
