package com.example.alex.favouritesongs;

import java.util.ArrayList;

/**
 * Created by Alex on 20/03/2018.
 */

public class FavouriteSongs {
    private ArrayList<Song> favouriteSongs;

    public FavouriteSongs() {
        favouriteSongs = new ArrayList<>();

        favouriteSongs.add(new Song(1, "Hotel California", "The Eagles"));
        favouriteSongs.add(new Song(2, "Welcome To The Machine", "Pink Floyd"));
        favouriteSongs.add(new Song(3, "Feel It Still", "Portugal. The Man"));
        favouriteSongs.add(new Song(4, "Surfin'", "Kid Cudi"));
        favouriteSongs.add(new Song(5, "Pray For Me", "The Weeknd"));
        favouriteSongs.add(new Song(6, "Silence", "Marshmello"));
        favouriteSongs.add(new Song(7, "Divinity (Mazde Remix)", "Kučka"));
        favouriteSongs.add(new Song(8, "Perfect 10", "The Beautiful South"));
        favouriteSongs.add(new Song(9, "Collarbone", "Fujiya & Miyagi"));
        favouriteSongs.add(new Song(10, "Danza kuduro", "Don Omar"));
        favouriteSongs.add(new Song(11, "Hate It Or Love It", "The Game"));
        favouriteSongs.add(new Song(12, "Praise You", "Fatboy Slim"));
        favouriteSongs.add(new Song(13, "Lose Yourself", "Eminem"));
        favouriteSongs.add(new Song(14, "Sinnerman", "Nina Simone"));
        favouriteSongs.add(new Song(15, "Pencil Full Of Lead", "Paolo Nutini"));
    }

    public ArrayList<Song> getFavouriteSongs() {
        return favouriteSongs;
    }
}
