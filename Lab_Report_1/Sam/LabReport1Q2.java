/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */

 //chosen
public class LabReport1Q2 {

    public static void main(String[] args) {
        //initialise 
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        int tempScore1; // first dice
        int tempScore2; // second dice
        int playerTurn = 1;
        int round;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        // User input the number of rounds wanted to play
        System.out.print("Please set number of round to play: ");
        round = sc.nextInt();
        System.out.println("Number of rounds: " + round);

        while (true) {

            // Generate the dice number for player 1
            tempScore1 = rd.nextInt(6) + 1;
            tempScore2 = rd.nextInt(6) + 1;

            // Print out generated dice numbers
            System.out.println(tempScore1 + " " + tempScore2);

            //if odd means check player 1's condition, starts from playerTurn=1
            if (playerTurn % 2 != 0) {
                if (tempScore1 == 6 && tempScore2 == 6) {
                    System.out.println("Player 1 got both dice with 6, roll again twice");
                    continue; // skip playerturn++ & redice

                } else if (tempScore1 == 1 && tempScore2 == 1) {
                    scorePlayer1 *= 2;
                    System.out.println("Player 1 got both dice with 1, score1=" + scorePlayer1);

                } else if (tempScore1 % 2 != 0 && tempScore2 % 2 != 0) {
                    scorePlayer1 -= 5;
                    System.out.println("Player 1 got both odd number but not both 1, score=" + scorePlayer1);

                } else {
                    scorePlayer1 += tempScore1 + tempScore2;
                    System.out.println("Player 1 score=" + scorePlayer1);
                }

            } else {  //check player2's condition
                if (tempScore1 == 6 && tempScore2 == 6) {
                    System.out.println("Player 2 got both dice with 6, roll again twice");
                    continue; // skip playerturn++ & redice

                } else if (tempScore1 == 1 && tempScore2 == 1) {
                    scorePlayer2 *= 2;
                    System.out.println("Player 2 got both dice with 1, score1=" + scorePlayer2);

                } else if (tempScore1 % 2 != 0 && tempScore2 % 2 != 0) {
                    scorePlayer2 -= 5;
                    System.out.println("Player 2 got both odd number but not both 1, score=" + scorePlayer2);

                } else {
                    scorePlayer2 += tempScore1 + tempScore2;
                    System.out.println("Player 2 score=" + scorePlayer2);
                }

                if (playerTurn == round * 2) { //break while-loop after last round
                    System.out.println();
                    System.out.println("Player 1's score : " + scorePlayer1);
                    System.out.println("Player 2's score : " + scorePlayer2);
                    if (scorePlayer1 > scorePlayer2) {
                        System.out.println("Player 1 wins!: ");
                    } else if (scorePlayer1 < scorePlayer2) {
                        System.out.println("Player 2 wins!: ");
                    } else if (scorePlayer1 == scorePlayer2) {
                        System.out.println("It's a draw!");
                    }
                    break;

                }
            }
            playerTurn++;

        }

    }
}
