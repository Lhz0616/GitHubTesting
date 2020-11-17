/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author chest
 */
import java.util.Random;

public class JavaApplication2 {
    static Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score1 = 0;
        int score2 = 0;
        while(score1 == score2){
            score1 = rollTwice(score1);
            score2 = rollTwice(score2);
        }
        System.out.println("Player 1 score : " + score1);
        System.out.println("Player 2 score : " + score2);
        if (score1 > score2){
            System.out.println("Player 1 wins the game");
        }
        else {
            System.out.println("Player 2 wins the game");
        }
    }
    
    public static int rollTwice(int score){
        int d1 = rand.nextInt(6) + 1;
        int d2 = rand.nextInt(6) + 1;
        System.out.println("d1 " + d1);
        System.out.println("d2 " + d2);
        while((d1 == 6) && (d2 == 6)){
            d1 = rand.nextInt(6) + 1;
            d2 = rand.nextInt(6) + 1;
            System.out.println("r d1 " + d1);
            System.out.println("r d2 " + d2);
        }
        int result = d1 + d2;
        if ((d1 == 1) && (d2 == 1)){
            result = score * 2;
        }
        if (((d1%2) == 1) && ((d2%2) == 1) && ((d1+d2) > 2)){
            result = score - 5;
        }
        return result;
    }
    
}
