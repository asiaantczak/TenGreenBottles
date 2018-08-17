package com.tengreenbottles;

public class Song {

    public static void play(int num) {
        String[] bottles = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String bottle;

        if (num == 1) {
            bottle = " green bottle\n";
        } else {
            bottle = " green bottles\n";
        }

        String verset1 = bottle + "Hanging on the wall\n";
        String verset2 = "And if one green bottle\n" + "Should accidentally fall\n";
        String verset3 = "There'll be ";
        String verset4 = bottle + "Hanging on the wall\n";

        if (num > 1) {
            System.out.println(bottles[num-1] + verset1 + bottles[num-1] + verset1 + verset2 + verset3 + bottles[num - 2].toLowerCase() + verset4);
        } else {
            verset2 = "If that one green bottle\n" + "Should accidentally fall\n";
            verset4 = "no green bottles\n" + "Hanging on the wall";
            System.out.println(bottles[num-1] + verset1 + bottles[num-1] + verset1 + verset2 + verset3 + verset4);
        }
    }

    public static void main(String[] args) {
       for (int i = 10; i > 0; i--) {
           play(i);
       }
    }


}
