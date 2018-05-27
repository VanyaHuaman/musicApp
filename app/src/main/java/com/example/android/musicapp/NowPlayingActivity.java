package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    String mSongName;
    String mArtist;
    String mSongYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        Intent receivedIntent = getIntent();
        mSongName = receivedIntent.getStringExtra("songName");
        mArtist = receivedIntent.getStringExtra("artistName");
        mSongYear = receivedIntent.getStringExtra("songYear");

        TextView songName = findViewById(R.id.songTitle);
        TextView artistName = findViewById(R.id.artistName);
        TextView songYear = findViewById(R.id.songYear);

        songName.setText(mSongName);
        artistName.setText(mArtist);
        songYear.setText(mSongYear);


    }
}
