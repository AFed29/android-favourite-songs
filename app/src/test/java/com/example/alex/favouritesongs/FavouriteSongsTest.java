package com.example.alex.favouritesongs;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 20/03/2018.
 */

public class FavouriteSongsTest {
    FavouriteSongs favouriteSongs;

    @Before
    public void before() {
        favouriteSongs = new FavouriteSongs();
    }

    @Test
    public void canGetList() {
        assertEquals(15, favouriteSongs.getFavouriteSongs().size());
    }
}
