package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    public int mTrackPosition;
    public Intent mReceivedIntent;
    public ArrayList<Song> mArtistSongArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        mReceivedIntent = getIntent();


        mArtistSongArray = (ArrayList<Song>) mReceivedIntent.getSerializableExtra("array");

        SongAdapter adapter = new SongAdapter(this, mArtistSongArray);

        ListView listView =findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                mTrackPosition=i;
                Intent nowPlayingIntent =
                        new Intent(SongActivity.this,NowPlayingActivity.class);

                nowPlayingIntent.putExtra("songName",mArtistSongArray.get(mTrackPosition).getSongName());
                nowPlayingIntent.putExtra("artistName",mArtistSongArray.get(mTrackPosition).getArtist());
                nowPlayingIntent.putExtra("songYear",mArtistSongArray.get(mTrackPosition).getSongYear());
                nowPlayingIntent.putExtra("array",mArtistSongArray);
                nowPlayingIntent.putExtra("track",mTrackPosition);

                startActivity(nowPlayingIntent);
            }
        });

    }


}
