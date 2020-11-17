/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labreport1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class LabReport1Q2 {

    public static void main(String[] args) {
        //initialise
        int score1 = 0;
        int score2 = 0;
        int tempScore1; // first dice
        int tempScore2; // second dice
        int playerTurn = 1;
        int round;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        //process & output
        System.out.print("Please set number of round to play: ");
        round = sc.nextInt();
        System.out.println("Number of rounds: " + round);

        while (true) {

            tempScore1 = rd.nextInt(6) + 1;
            tempScore2 = rd.nextInt(6) + 1;
            System.out.println(tempScore1 + " " + tempScore2);

            if (playerTurn % 2 != 0) {  //if odd means check player 1's condition, starts from playerTurn=1
                if (tempScore1 == 6 && tempScore2 == 6) {
                    System.out.println("Player 1 got both dice with 6, roll again twice");
                    continue; // skip playerturn++ & redice
                } else if (tempScore1 == 1 && tempScore2 == 1) {
                    score1 *= 2;
                    System.out.println("Player 1 got both dice with 1, score1=" + score1);
                } else if ((tempScore1 % 2 != 0 && tempScore2 % 2 != 0) && (tempScore1 != 1 && tempScore2 != 1)) {
                    score1 -= 5;
                    System.out.println("Player 1 got both odd number but not both 1, score=" + score1);
                } else {
                    score1 += tempScore1 + tempScore2;
                    System.out.println("Player 1 score=" + score1);
                }

            } else {  //check player2's condition
                if (tempScore1 == 6 && tempScore2 == 6) {
                    System.out.println("Player 2 got both dice with 6, roll again twice");
                    continue; // skip playerturn++ & redice
                } else if (tempScore1 == 1 && tempScore2 == 1) {
                    score2 *= 2;
                    System.out.println("Player 2 got both dice with 1, score1=" + score2);
                } else if ((tempScore1 % 2 != 0 && tempScore2 % 2 != 0) && (tempScore1 != 1 && tempScore2 != 1)) {
                    score2 -= 5;
                    System.out.println("Player 2 got both odd number but not both 1, score=" + score2);
                } else {
                    score2 += tempScore1 + tempScore2;
                    System.out.println("Player 2 score=" + score2);
                }

                if (playerTurn == round * 2) { //break while-loop after last round
                    System.out.println();
                    System.out.println("Player 1's score : " + score1);
                    System.out.println("Player 2's score : " + score2);
                    if (score1 > score2) {
                        System.out.println("Player 1 wins!: ");
                    } else if (score1 < score2) {
                        System.out.println("Player 2 wins!: ");
                    } else if (score1 == score2) {
                        System.out.println("It's a draw!");
                    }
                    break;

                }
            }
            playerTurn++;

        }

    }
}
