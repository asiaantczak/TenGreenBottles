package com.tengreenbottles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class SongTest {

    @Test
     public void printsFirstStanzaForTenBottles() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Song song = new Song();
        song.play(10);
        String stanza = "Ten green bottles\n" +
                "Hanging on the wall\n" +
                "Ten green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be nine green bottles\n" +
                "Hanging on the wall";
        Assertions.assertEquals(stanza, outContent.toString());
    }

    @Test
     public void printsStanzaForTwoBottlesAndOneLeftAtTheEnd() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Song song = new Song();
        song.play(2);
        String stanza = "Two green bottles\n" +
                "Hanging on the wall\n" +
                "Two green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be one green bottle\n" +
                "Hanging on the wall";
        Assertions.assertEquals(stanza, outContent.toString());
    }

    



}