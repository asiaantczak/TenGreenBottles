package com.tengreenbottles;

public class Song {

    public static void play(int num) {
        String[] bottles = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String verset1 = " green bottles\n" + "Hanging on the wall\n";
        String verset2 = "And if one green bottle\n" + "Should accidentally fall\n";
        String verset3 = "There'll be ";
        String verset4 = " green bottles\n" + "Hanging on the wall";


        System.out.print(bottles[num-1] + verset1 + bottles[num-1] + verset1 + verset2 + verset3 + bottles[num - 2].toLowerCase() + verset4);
    }

//    public static void main(String[] args) {
//        play(10);
//    }


}
