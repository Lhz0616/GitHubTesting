import java.util.Arrays;

public class A1Q2 {
    public static void main(String[] args) {
        int[] player1 = new int[2];
        int[] player2 = new int[2];
        int sumPlayer1;
        int sumPlayer2;

        System.out.println("Welcome to the dice game!! There will be 2 players playing this game!");
        System.out.println("The player with the highest marks wins.");
        System.out.println("--------------------------------------------------------------------------------\n\n");

        System.out.println("The game starts now!!");
        System.out.println("--------------------------------------------------------------------------------\n\n");
        System.out.println("Rolling the dice for player 1.");
        System.out.println("Player 1 dices' : ");

        sumPlayer1 = actualGame(player1);
        System.out.println("\n\n");
        System.out.println("Rolling the dice for player 2.");
        System.out.println("Player 2 dices' : ");
        sumPlayer2 = actualGame(player2);

        System.out.println("\n\nSum of Player 1 : " + sumPlayer1);
        System.out.println("Sum of Player 2 : " + sumPlayer2);
        if(sumPlayer1 > sumPlayer2) System.out.println("Player 1 wins.");
        else if(sumPlayer2 > sumPlayer1) System.out.println("Player 2 wins.");
        else System.out.println("It's a tie.");
    }

    static int actualGame(int[] array){
        int sum = 0;
        while (true) {

            for (int i = 0; i<array.length; i++) array[i] = (int) (Math.random() * 6 + 1);
            System.out.println(Arrays.toString(array));

            if(array[0] == 6 && array[1] == 6) {
                System.out.println("Roll again and please don't use any software to hack the dice. You are not so lucky.");
            }
            else if(array[0] == 1 && array[1] == 1){
                sum = sum + 2 * 2;
                System.out.println("Haih, why are you so pity? Can't you get more than 2 marks??");
                System.out.println("I'll double the marks for you.");
                break;
            }

            else if(array[0] % 2 == 1 && array[1] % 2 == 1){
                sum = sum + array[0] + array[1] - 5;
                break;
            }
            else {
                sum = sum + array[0] + array[1];
                break;
            }
        }
        System.out.println("--------------------------------------------------------------------------------");
        return sum;
    }
}


