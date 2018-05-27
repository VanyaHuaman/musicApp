package com.example.android.musicapp;

public class Song {
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

    public void setSongName(String songName) {
        mSongName = songName;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }

    public String getSongYear() {
        return mSongYear;
    }

    public void setSongYear(String songYear) {
        mSongYear = songYear;
    }




}
