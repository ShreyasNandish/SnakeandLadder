package com.bridgelabz.SnakeandLadder;

public class SnakeandLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");

        int currentPosition = 0;
        int diceNumber = (int) ((Math.random() * 10 % 6) + 1);
        System.out.println("Dice Number is : " + diceNumber);
    }
}
