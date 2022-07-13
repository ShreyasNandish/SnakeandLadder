package com.bridgelabz.SnakeandLadder;

public class SnakeandLadder {

    public static final int START_POSITION = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static final int NO_PLAY = 0;
    public static int currentPosition = 0;
    public static int diceRollCount = 0;

    public static void playerPositionMoves() {
        while (currentPosition < 100) {
            int diceNumber = (int) ((Math.random() * 10 % 6) + 1);
            System.out.println("Dice Number : " + diceNumber);

            int option = (int) ((Math.random() * 10 % 3) + 1);
            if (option == IS_SNAKE) {
                currentPosition -= diceNumber;
                System.out.println("Player got bitten by snake ");
            }
            else if (option == IS_LADDER) {
                currentPosition += diceNumber;
                System.out.println("Player moves ahead with ladder ");
            }
            else if (option == NO_PLAY) {
                System.out.println("NO Play");
            }

            if (currentPosition < START_POSITION) {
                currentPosition = START_POSITION;
            } else if (currentPosition > 100) {
                currentPosition -= diceNumber;
            }
            System.out.println("Player moves  to position: " + currentPosition);
            diceRollCount++;
        }
    }

    public static void playUntilWin() {
        while (currentPosition != 100) {
            playerPositionMoves();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        playUntilWin();
        System.out.println("Player won the game");
        System.out.println("The total number of dice counts is :"+diceRollCount);
    }
}
