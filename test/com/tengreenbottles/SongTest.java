package com.tengreenbottles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class SongTest {

    ByteArrayOutputStream outContent;
    Song song;

    @BeforeEach
    public void setUp() throws Exception {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        song = new Song();
    }

    @Test
     public void printsFirstStanzaForTenBottles() {
        song.play(10);
        String stanza = "Ten green bottles\n" +
                "Hanging on the wall\n" +
                "Ten green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be nine green bottles\n" +
                "Hanging on the wall\n" +
                "\n";
        Assertions.assertEquals(stanza, outContent.toString());
    }

    @Test
     public void printsStanzaForTwoBottlesAndOneLeftAtTheEnd() {
        song.play(2);
        String stanza = "Two green bottles\n" +
                "Hanging on the wall\n" +
                "Two green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be one green bottles\n" +
                "Hanging on the wall\n" +
                "\n";
        Assertions.assertEquals(stanza, outContent.toString());
    }

    @Test
    public void printLastStanzaForOneBottle() {
        song.play(1);
        String stanza = "One green bottle\n" +
                "Hanging on the wall\n" +
                "One green bottle\n" +
                "Hanging on the wall\n" +
                "If that one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be no green bottles\n" +
                "Hanging on the wall\n";
        Assertions.assertEquals(stanza, outContent.toString());
    }

    @Test
    public void printsAll10Stanzas() {
        for(int i = 10; i > 0; i--) {
            song.play(i);
        }
        String lyrics = "Ten green bottles\n" +
                "Hanging on the wall\n" +
                "Ten green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be nine green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "Nine green bottles\n" +
                "Hanging on the wall\n" +
                "Nine green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be eight green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "Eight green bottles\n" +
                "Hanging on the wall\n" +
                "Eight green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be seven green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "Seven green bottles\n" +
                "Hanging on the wall\n" +
                "Seven green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be six green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "Six green bottles\n" +
                "Hanging on the wall\n" +
                "Six green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be five green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "Five green bottles\n" +
                "Hanging on the wall\n" +
                "Five green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be four green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "Four green bottles\n" +
                "Hanging on the wall\n" +
                "Four green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be three green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "Three green bottles\n" +
                "Hanging on the wall\n" +
                "Three green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be two green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "Two green bottles\n" +
                "Hanging on the wall\n" +
                "Two green bottles\n" +
                "Hanging on the wall\n" +
                "And if one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be one green bottles\n" +
                "Hanging on the wall\n" +
                "\n" +
                "One green bottle\n" +
                "Hanging on the wall\n" +
                "One green bottle\n" +
                "Hanging on the wall\n" +
                "If that one green bottle\n" +
                "Should accidentally fall\n" +
                "There'll be no green bottles\n" +
                "Hanging on the wall\n";
        Assertions.assertEquals(lyrics, outContent.toString());
    }
}