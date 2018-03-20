package com.example.alex.favouritesongs;

/**
 * Created by Alex on 20/03/2018.
 */

public class Song {
    private int ranking;
    private String title;
    private String artist;

    public Song(int ranking, String title, String artist) {
        this.ranking = ranking;
        this.title = title;
        this.artist = artist;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
