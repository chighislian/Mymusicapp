package com.example.musicapp

import android.app.Activity
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(val context: Activity, val datalist: List<Data>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        // create the view in case the layout manager fails to create
        val itemView = LayoutInflater.from(context).inflate(R.layout.each_item, p0, false)
        return MyViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        val currentData = datalist[p1]

        val mediaPlayer = MediaPlayer.create(context,currentData.preview.toUri())
        p0.title.text = currentData.title

        Picasso.get().load(currentData.album.cover).into(p0.image);
        p0.play.setOnClickListener {
            mediaPlayer.start()
        }

        p0.pause.setOnClickListener {
            mediaPlayer.stop()
        }


    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView
        val title: TextView
        val play: ImageButton
        val pause:  ImageButton

        init {
            image = itemView.findViewById(R.id.musicImage)
            title = itemView.findViewById(R.id.musicTitle)
            play = itemView.findViewById(R.id.btnPlay)
            pause = itemView.findViewById(R.id.btnPause)
        }
    }
}