package com.example.android.musicapp;

import java.io.Serializable;
import java.util.ArrayList;

public class Artist implements Serializable{

    private String mArtistName;
    private ArrayList<Song> mSongList;

    public Artist(String artistName, ArrayList<Song> songList){
        mArtistName = artistName;
        mSongList = songList;
    }

    public String getArtistName() {
        return mArtistName;
    }



    public ArrayList<Song> getSongList() {
        return mSongList;
    }



}
