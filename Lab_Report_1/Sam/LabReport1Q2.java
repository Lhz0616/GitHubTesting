
import java.util.Random;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        //set initial score of both players as 0
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        int tempScore1; // first dice
        int tempScore2; // second dice
        int playerTurn = 1; // this variable is declared to make sure the players roll the dices turn by turn
                                       // if its odd means its player 1's turn and if its even means its player 2's turn
        int round;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        // User input the number of rounds they want to play
        System.out.print("Please set number of round to play : ");
        round = sc.nextInt();
        System.out.println("Number of rounds: " + round);

        while (true) {

            // Generate the dice number for the player
            tempScore1 = rd.nextInt(6) + 1;
            tempScore2 = rd.nextInt(6) + 1;

            //to check the turn, if its odd means that its player 1's turn right now
            if (playerTurn % 2 != 0) {
                System.out.println("Player 1's turn : ");
                System.out.println("Dice 1 : " + tempScore1);
                System.out.println("Dice 2 : " + tempScore2);
                if (tempScore1 == 6 && tempScore2 == 6) {
                    System.out.println("Player 1 : first and second dice value are 6, roll again twice");
                    continue; // if first and second dice value are 6, the player 1 will reroll twice

                } else if (tempScore1 == 1 && tempScore2 == 1) {
                    scorePlayer1 *= 2;
                    // if first and second dice value are 1, multiply the player 1's existing score by 2

                } else if (tempScore1 % 2 != 0 && tempScore2 % 2 != 0) {
                    scorePlayer1 -= 5;
                    // if first and second dice value are both odd number and not both 1, subtract 5 from the player 1's existing score

                } else {
                    scorePlayer1 += tempScore1 + tempScore2;
                    // player 1's score is the sum of both dices value if the special rules are not met
                }
                System.out.println("Player 1's score = " + scorePlayer1);

            } 
            
            // the playerTurn is not odd, so its player 2's turn right now
            else {  
                System.out.println("Player 2's turn : ");
                System.out.println("Dice 1 : " + tempScore1);
                System.out.println("Dice 2 : " + tempScore2);
                if (tempScore1 == 6 && tempScore2 == 6) {
                    System.out.println("Player 2 got both dice with 6, roll again twice");
                    continue; // if first and second dice value are 6, the player 2 will reroll twice

                } else if (tempScore1 == 1 && tempScore2 == 1) {
                    scorePlayer2 *= 2;
                    // if first and second dice value are 1, multiply the player 2's existing score by 2

                } else if (tempScore1 % 2 != 0 && tempScore2 % 2 != 0) {
                    scorePlayer2 -= 5;
                    // if first and second dice value are both odd number and not both 1, subtract 5 from the player 2's existing score

                } else {
                    scorePlayer2 += tempScore1 + tempScore2;
                    // player 2's score is the sum of both dices value if the special rules are not met
                }
                System.out.println("Player 2's score = " + scorePlayer2);

                if (playerTurn == round * 2) { //if the condition is true, means that both player have finished their turns
                    //determine and print the result of the game
                    System.out.println();
                    System.out.println("Player 1's final score : " + scorePlayer1);
                    System.out.println("Player 2's final score : " + scorePlayer2);
                    if (scorePlayer1 > scorePlayer2) {
                        System.out.println("Player 1 wins! ");
                    } else if (scorePlayer1 < scorePlayer2) {
                        System.out.println("Player 2 wins! ");
                    } else if (scorePlayer1 == scorePlayer2) {
                        System.out.println("It's a draw!");
                    }
                    break; //to break the while loop after last round

                }
            }
            playerTurn++; // to change the turn of players

        }

    }
}
