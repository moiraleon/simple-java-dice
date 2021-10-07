package com.devmountain.java.mandrcode;

import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
        Random diceFace = new Random();
        int x = diceFace.nextInt(6)+1;//bound tells range and is offset by one, so we add 1 to raise the bounds from 0-5 to the new bounds of 1-6

	System.out.println("You rolled a: "+ x);
    }
}
