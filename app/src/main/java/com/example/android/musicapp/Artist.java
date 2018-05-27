package com.example.android.musicapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    public void setArtistName(String artistName) {
        mArtistName = artistName;
    }

    public ArrayList<Song> getSongList() {
        return mSongList;
    }

    public void setSongList(ArrayList<Song> songList) {
        mSongList = songList;
    }



}
