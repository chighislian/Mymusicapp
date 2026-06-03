# MusicApp - School Project

A simple Android application that fetches and plays music previews using the Deezer API. This project was developed as part of a school assignment to demonstrate networking, JSON parsing, and media playback in Android.

## 🚀 Features

*   **Deezer API Integration**: Fetches real-time music data (currently configured for artist "Akon").
*   **Music Discovery**: Displays a list of tracks with their titles and album covers.
*   **Audio Preview**: Includes a built-in media player to play and pause 30-second track previews.
*   **Dynamic UI**: Utilizes `RecyclerView` for efficient list rendering and Picasso for asynchronous image loading.

## 🛠 Tech Stack

*   **Language**: Kotlin
*   **Networking**: [Retrofit 2](https://square.github.io/retrofit/) with Gson converter for handling API requests.
*   **Image Loading**: [Picasso](https://square.github.io/picasso/) for fetching and caching album art.
*   **Media Playback**: Android `MediaPlayer` for streaming audio previews.
*   **Architecture**: Follows standard Android Activity-Adapter pattern.

## 📖 How it Works

1.  **API Call**: When the app starts, `MainActivity` initializes a Retrofit instance and makes a GET request to the Deezer API via `ApiInterface`.
2.  **Data Parsing**: The JSON response is automatically converted into Kotlin Data Objects (`MyData`, `Data`, `Album`, `Artist`).
3.  **UI Updates**: Once the data is received, it is passed to `MyAdapter`, which populates the `RecyclerView`.
4.  **Interaction**:
    *   Clicking the **Play** button starts the `MediaPlayer` using the `preview` URL of the track.
    *   Clicking the **Pause** button stops the playback.

## ⚙️ Setup

To run this project:
1.  Clone the repository.
2.  Open the project in **Android Studio**.
3.  Ensure you have an active internet connection (required for API calls and image loading).
4.  Sync Gradle and run the app on an emulator or physical device.

## 📝 Dependencies

The project uses the following key libraries:
*   `com.squareup.retrofit2:retrofit`
*   `com.squareup.retrofit2:converter-gson`
*   `com.squareup.picasso:picasso`
