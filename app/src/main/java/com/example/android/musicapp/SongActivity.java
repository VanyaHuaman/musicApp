package com.example.android.musicapp;

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

        String artist = "Frank Sinatra";
        /*
         **String Array with 32 Frank Sinatra Songs
         */
        List<String> songArray = Arrays.asList("My Way", "Fly Me to the Moon", "New York, New York",
                "I've Got You Under My Skin", "The Way You Look Tonight", "Somethin' Stupid",
                "The Girl from Ipanema", "One for My Baby", "Strangers in the Night",
                "My Funny Valentine", "Young at Heart", "I've Got The World On A String",
                "You Make Me Feel So Young", "Love And Marriage", "The Best Is Yet To Come",
                "It Was a Verry Good Year", "Summer Wind", "Luck Be A Lady", "That's Life",
                "I Get A Kick Out Of You", "High Hopes", "The Lady Is A Tramp", "The Song Is You",
                "I've Got a Crush on You", "My Kind Of Town", "Nancy", "All or Nothing at All",
                "They Can't Take That Away from Me", "Someone To Watch Over Me", "Blue Moon",
                "Old Devil Moon", "That Old Black Magic");

        List<String> songYearArray = Arrays.asList("1969", "1964", "1979", "1956", "1964", "1967", "1967",
                "1947", "1966", "1953", "1953", "1953", "1956", "1955", "1964", "1965", "1966", "1963",
                "1966", "1953", "1959", "1956", "1942", "1947", "1964", "1944", "1939", "1953", "1945",
                "1960", "1956", "1946");


        ArrayList<Song> songs = new ArrayList<Song>();
        for (int x = 0; x < songArray.size(); x++) {
            songs.add(new Song(songArray.get(x), artist, songYearArray.get(x)));
        }


        SongAdapter adapter = new SongAdapter(this, songs);

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
