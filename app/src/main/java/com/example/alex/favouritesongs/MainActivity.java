package com.example.alex.favouritesongs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FavouriteSongs favouriteSongs = new FavouriteSongs();
        ArrayList<Song> list = favouriteSongs.getFavouriteSongs();

        FavouriteSongsAdapter songAdapter = new FavouriteSongsAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
