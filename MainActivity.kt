package com.example.wishyouwerehere

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var placeAdapter: PlaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the screen layout
        setContentView(R.layout.activity_main)

        // Connect RecyclerView from XML
        recyclerView = findViewById(R.id.recyclerView)

        // Create list of Sydney locations
        val places = listOf(

            Place(
                name = "Bondi Beach",
                location = "Sydney, NSW",
                dateVisited = "Visited in January 2025",
                rating = 4.5f,
                imageResId = R.drawable.bondi
            ),

            Place(
                name = "Sydney Opera House",
                location = "Sydney, NSW",
                dateVisited = "Visited in February 2025",
                rating = 5.0f,
                imageResId = R.drawable.opera
            ),

            Place(
                name = "Darling Harbour",
                location = "Sydney, NSW",
                dateVisited = "Visited in March 2025",
                rating = 4.0f,
                imageResId = R.drawable.darling
            ),

            Place(
                name = "Blue Mountains",
                location = "NSW, Australia",
                dateVisited = "Visited in April 2025",
                rating = 5.0f,
                imageResId = R.drawable.bluemountains
            )
        )

        // Create adapter
        placeAdapter = PlaceAdapter(places) { selectedPlace ->

            // Open DetailActivity when item clicked
            val intent = Intent(this, DetailActivity::class.java)

            // Send selected place object
            intent.putExtra("place", selectedPlace)

            startActivity(intent)
        }

        // Set RecyclerView layout
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Attach adapter
        recyclerView.adapter = placeAdapter
    }
}