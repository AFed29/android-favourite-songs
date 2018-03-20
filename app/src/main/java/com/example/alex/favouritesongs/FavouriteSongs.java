package com.example.alex.favouritesongs;

import java.util.ArrayList;

/**
 * Created by Alex on 20/03/2018.
 */

public class FavouriteSongs {
    private ArrayList<Song> favouriteSongs;

    public FavouriteSongs() {
        favouriteSongs = new ArrayList<>();

        favouriteSongs.add(new Song(1, "Hotel California", "The Eagles", R.drawable.hotel_california));
        favouriteSongs.add(new Song(2, "Welcome To The Machine", "Pink Floyd", R.drawable.welcome_to_the_machine));
        favouriteSongs.add(new Song(3, "Feel It Still", "Portugal. The Man", R.drawable.feel_it_still));
        favouriteSongs.add(new Song(4, "Surfin'", "Kid Cudi", R.drawable.surfin));
        favouriteSongs.add(new Song(5, "Pray For Me", "The Weeknd", R.drawable.pray_for_me));
        favouriteSongs.add(new Song(6, "Silence", "Marshmello", R.drawable.silence));
        favouriteSongs.add(new Song(7, "Divinity (Mazde Remix)", "Kučka", R.drawable.divinity));
        favouriteSongs.add(new Song(8, "Perfect 10", "The Beautiful South", R.drawable.perfect_10));
        favouriteSongs.add(new Song(9, "Collarbone", "Fujiya & Miyagi", R.drawable.collarbone));
        favouriteSongs.add(new Song(10, "Danza kuduro", "Don Omar", R.drawable.danza_kuduro));
        favouriteSongs.add(new Song(11, "Hate It Or Love It", "The Game", R.drawable.hate_it_or_love_it));
        favouriteSongs.add(new Song(12, "Praise You", "Fatboy Slim", R.drawable.praise_you));
        favouriteSongs.add(new Song(13, "Lose Yourself", "Eminem", R.drawable.lose_yourself));
        favouriteSongs.add(new Song(14, "Sinnerman", "Nina Simone", R.drawable.sinnerman));
        favouriteSongs.add(new Song(15, "Pencil Full Of Lead", "Paolo Nutini", R.drawable.pencil_full_of_lead));
    }

    public ArrayList<Song> getFavouriteSongs() {
        return favouriteSongs;
    }
}
