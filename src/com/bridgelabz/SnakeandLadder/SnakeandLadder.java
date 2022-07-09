package com.bridgelabz.SnakeandLadder;

public class SnakeandLadder {

    public static final int START_POSITION = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");

        int currentPosition = 0;
        int diceNumber = (int) ((Math.random() * 10 % 6) + 1);
        System.out.println("Dice Number is : " + diceNumber);

        int option = (int) ((Math.random() * 10 % 3) + 1);
        if (option == IS_SNAKE) {
            currentPosition -= diceNumber;
            if(currentPosition<0){
                currentPosition=START_POSITION;
            }
            System.out.println("Player got with snake position : " + currentPosition);
        } else if (option == IS_LADDER) {
            currentPosition += diceNumber;
            System.out.println("Player got ladder position : " + currentPosition);
        } else {
            System.out.println("No Play " + currentPosition);
        }
    }
}
