package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist>{

    public ArtistAdapter(Context context, ArrayList<Artist> artist){
        super(context,0,artist);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artists_item, parent, false);
        }

        Artist currentArtist = getItem(position);

        TextView ArtistNameTextView = (TextView) listItemView.findViewById(R.id.artistItemTextView);
        ArtistNameTextView.setText(currentArtist.getArtistName());


        return listItemView;
    }
}

