package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs){
        super(context,0,songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.songNameTextView);
        songNameTextView.setText(currentSong.getSongName());

        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.artistTextView);
        songArtistTextView.setText(currentSong.getArtist());

        TextView songYearTextView = (TextView) listItemView.findViewById(R.id.songYearTextView);
        songYearTextView.setText(currentSong.getSongYear());

        return listItemView;
    }
}
