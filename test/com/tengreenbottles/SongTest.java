package com.tengreenbottles;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    @Test
    public void returnTheSongForTenBottles() {
        Song song = new Song();
        String lyrics = "Ten green bottles\n" +
                "Hanging on the wall\n" +
                "Ten green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be nine green bottles\n" +
                "Hanging on the wall";
        assertEquals(lyrics, song.play());
    }
}