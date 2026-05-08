package com.example.wishyouwerehere

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(
    private val places: List<Place>,
    private val onClick: (Place) -> Unit
) : RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.placeImage)
        val name: TextView = itemView.findViewById(R.id.placeName)
        val location: TextView = itemView.findViewById(R.id.placeLocation)
        val rating: RatingBar = itemView.findViewById(R.id.placeRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_place, parent, false)

        return PlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val place = places[position]

        holder.image.setImageResource(place.imageResId)
        holder.name.text = place.name
        holder.location.text = place.location
        holder.rating.rating = place.rating

        holder.itemView.setOnClickListener {
            onClick(place)
        }
    }

    override fun getItemCount(): Int = places.size
}