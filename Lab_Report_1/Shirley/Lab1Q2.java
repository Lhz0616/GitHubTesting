import java.util.Random;

public class Lab1Q2 {
    public static void main(String[] args) {

        int player11, player12, player21, player22;
        int score1=0;
        int score2=0;

        Random random = new Random();
        int i=0;
        do {
            int temp=0;
            do {
                System.out.println("Player 1 rolls the dice");
                player11 = random.nextInt(6) + 1;
                player12 = random.nextInt(6) + 1;
                temp = player11 + player12;
                System.out.println(player11 + "\t" + player12 + "\t" + temp);
                if (player11 == 1 && player12 == 1) {
                    temp = temp * 2;

                } else if ((player11 % 2 != 0 && player12 % 2 != 0) && (player11 != 1 && player12 != 1)) {
                    temp -= 5;
                } else if (player11 == 6 && player12 == 6) {
                    temp -= 12;
                    System.out.println("Player 1 rerolls the dice");
                }
            } while (player11 == 6 && player12 == 6);
             score1=score1 +temp;
            System.out.println("P1 Score: "+ score1);
            i++;
        } while (i<2);
        System.out.println("");


        //Player2

        int ii=0;
        do {
            int temp2=0;
            do {
                System.out.println("Player 2 rolls the dice");
                player21 = random.nextInt(6) + 1;
                player22 = random.nextInt(6) + 1;
                temp2= player21 + player22;
                System.out.println(player21 + "\t" + player22 + "\t" + temp2);
                if (player21 == 1 && player22 == 1) {
                    temp2 = temp2 * 2;

                } else if ((player21 % 2 != 0 && player22 % 2 != 0) && (player21 != 1 && player22 != 1)) {
                    temp2 -= 5;
                } else if (player21 == 6 && player22 == 6) {
                    System.out.println("Player 2 rerolls the dice");
                    temp2 -= 12 ;
                }
            } while (player21 == 6 && player22 == 6);
            score2= score2 + temp2;
            System.out.println("P2 Score: "+ score2);
            ii++;
        } while (ii<2);

        System.out.println("");

        //deduce winner
        if (score1>score2) {
            System.out.println("*Player 1 wins*");
        }
        else if (score1==score2){
            System.out.println("*It's a tie*");
        }
        else {
            System.out.println("*Player 2 wins*");
        }

    }
}
