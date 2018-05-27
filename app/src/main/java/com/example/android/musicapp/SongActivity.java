package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SongActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        Intent receivedIntent = getIntent();

        @SuppressWarnings({"unchecked"})
        ArrayList<Song> artistSongArray = new ArrayList<Song>();
        artistSongArray = (ArrayList<Song>) receivedIntent.getSerializableExtra("array");

        SongAdapter adapter = new SongAdapter(this, artistSongArray);

        ListView listView =(ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //TODO ADD CODE FOR NOW PLAYING
            }
        });

    }


}
