package com.example.alex.favouritesongs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 20/03/2018.
 */

public class SongTest {
    Song song;

    @Before
    public void before() {
        song = new Song(20, "Hotel California", "The Eagles");
    }

    @Test
    public void canGetRanking() {
        assertEquals((Integer)20, song.getRanking());
    }

    @Test
    public void canGetTitle() {
        assertEquals("Hotel California", song.getTitle());
    }

    @Test
    public void canGetArtist() {
        assertEquals("The Eagles", song.getArtist());
    }
}
