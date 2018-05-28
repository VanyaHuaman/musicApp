package com.example.android.musicapp;

import java.io.Serializable;

public class Song implements Serializable{
    private String mSongName;
    private String mArtist;
    private String mSongYear;

    public Song(String song, String artist, String year){
        mSongName = song;
        mArtist = artist;
        mSongYear = year;
    }

    public String getSongName() {
        return mSongName;
    }



    public String getArtist() {
        return mArtist;
    }



    public String getSongYear() {
        return mSongYear;
    }






}
