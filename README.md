WishYouWereHere

Overview
WishYouWereHere is an Android app that displays a list of locations with images, ratings, and details. Users can click on a location to view more information on a separate screen.

Features
- Displays 4 locations with images
- Shows name, location, and rating
- Clickable items using RecyclerView
- Opens a detailed screen for each location
- Data passed using Parcelable
- Back navigation supported

Screens
1. Main Screen:
   - List of locations
   - Image, title, location, rating

2. Detail Screen:
   - Larger image
   - Full details (name, location, date visited, rating)

Technologies Used
- Kotlin
- Android Studio
- RecyclerView
- Parcelable
- Intents


Project Structure
- `MainActivity.kt` – Main screen
- `DetailActivity.kt` – Detail screen
- `Place.kt` – Data model (Parcelable)
- `PlaceAdapter.kt` – RecyclerView adapter
- `res/layout` – XML UI layouts
- `res/drawable` – Images

How to Run
1. Open project in Android Studio
2. Build and run on emulator or device

Author
Student submission for Android Development assignment

