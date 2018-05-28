package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    String mSongName;
    String mArtist;
    String mSongYear;
    ArrayList<Song> mArtistSongArray;
    TextView mSongNameTextView;
    TextView mArtistNameTextView;
    TextView mSongYearTextView;
    ImageView mPreviousImage;
    ImageView mNextImage;
    TextView mSongListButton;
    Intent mReceivedIntent;
    int mTrackPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        mPreviousImage = findViewById(R.id.previousTrackButton);
        mNextImage = findViewById(R.id.nextTrackButton);
        mSongListButton = findViewById(R.id.songListButton);

        getTrackInfo();

        mPreviousImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousTrack();
            }
        });

        mNextImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextTrack();
            }
        });

        mSongListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });
    }

    public void nextTrack(){

        if(mTrackPosition < mArtistSongArray.size()-1){
            mTrackPosition++;

         mSongName = mArtistSongArray.get(mTrackPosition).getSongName();
         mArtist = mArtistSongArray.get(mTrackPosition).getArtist();
         mSongYear = mArtistSongArray.get(mTrackPosition).getSongYear();

         setTrackInfo();

        }
    }

    public void previousTrack(){

        if(mTrackPosition>0){
            mTrackPosition--;

            mSongName = mArtistSongArray.get(mTrackPosition).getSongName();
            mArtist = mArtistSongArray.get(mTrackPosition).getArtist();
            mSongYear = mArtistSongArray.get(mTrackPosition).getSongYear();

            setTrackInfo();

        }
    }

    public void getTrackInfo(){
        mReceivedIntent = getIntent();
        mSongName = mReceivedIntent.getStringExtra("songName");
        mArtist = mReceivedIntent.getStringExtra("artistName");
        mSongYear = mReceivedIntent.getStringExtra("songYear");
        mArtistSongArray = (ArrayList<Song>) mReceivedIntent.getSerializableExtra("array");
        mTrackPosition = mReceivedIntent.getIntExtra("track",0);

        setTrackInfo();

    }

    public void setTrackInfo(){
        mSongNameTextView = findViewById(R.id.songTitle);
        mArtistNameTextView = findViewById(R.id.artistName);
        mSongYearTextView = findViewById(R.id.songYear);

        mSongNameTextView.setText(mSongName);
        mArtistNameTextView.setText(mArtist);
        mSongYearTextView.setText(mSongYear);
    }

}
