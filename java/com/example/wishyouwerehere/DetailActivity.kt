package com.example.wishyouwerehere

import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Get data from intent
        val place = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("place", Place::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Place>("place")
        }

        // Connect views
        val image = findViewById<ImageView>(R.id.detailImage)
        val name = findViewById<TextView>(R.id.detailName)
        val location = findViewById<TextView>(R.id.detailLocation)
        val date = findViewById<TextView>(R.id.detailDate)
        val rating = findViewById<RatingBar>(R.id.detailRating)

        // Display data safely using scope function
        place?.let {
            image.setImageResource(it.imageResId)
            name.text = it.name
            location.text = it.location
            date.text = it.dateVisited
            rating.rating = it.rating
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
} // end of class