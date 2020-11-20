import java.util.Random;

public class LabReport2 {

        public static int roll(){
            Random r = new Random();
            return r.nextInt(6)+1;
        }

        public static void main(String[] args) {
            int p1_1 = roll();
            int p1_2 = roll();
            int p2_1 = roll();
            int p2_2 = roll();
            System.out.println("Player 1 : " + p1_1 + " " + p1_2);
            int sum1 = 0, sum2 = 0;

            /**
             * Selection of Player 1
             */
            if (p1_1 == 6 && p1_2 == 6) {
                while (p1_1 == 6 && p1_2 == 6) {
                    p1_1 = roll();
                    p1_2 = roll();
                    System.out.println("Player 1 : " + p1_1 + " " + p1_2);
                    if (p1_1 != 6 && p1_2 != 6) {
                        break;
                    }
                }
                if (p1_1 == 1 && p1_2 == 1) {
                    sum1 *= 2;
                }

                else if ((p1_1 % 2 != 0 && p1_2 % 2 != 0) && (p1_1 != 1 && p1_2 != 1)) {
                    sum1 -= 5;
                }

                else {
                    sum1 += p1_1+p1_2;
                }
            }

            else if (p1_1 == 1 && p1_2 == 1) {
                sum1 *= 2;
            }

            else if ((p1_1 % 2 != 0 && p1_2 % 2 != 0) && (p1_1 != 1 || p1_2 != 1)) {
                sum1 -= 5;
            }

            else {
                sum1 += p1_1+p1_2;
            }

            System.out.println("Score Player 1: "+  sum1);

            /**
             * Selection of Player 2
             */
            System.out.println();
            System.out.println("Player 2 : " + p2_1 + " " + p2_2);
            if (p2_1 == 6 && p2_2 == 6) {
                while (p2_1 == 6 && p2_2 == 6) {
                    p2_1 = roll();
                    p2_2 = roll();
                    System.out.println("Player 2 : " + p2_1 + " " + p2_2);
                    if (p2_1 != 6 && p2_2 != 6) {
                        break;
                    }
                }
                if (p2_1 == 1 && p2_2 == 1) {
                    sum2 *= 2;
                } else if ((p2_1 % 2 != 0 && p2_2 % 2 != 0) && (p2_1 != 1 && p2_2 != 1)) {
                    sum2 -= 5;
                } else {
                    sum2 += p1_1+p2_2;
                }
            }

            else if (p2_1 == 1 && p2_2 == 1) {
                sum2 *= 2;
            }

            else if ((p2_1 % 2 != 0 && p2_2 % 2 != 0) && (p2_1 != 1 || p2_2 != 1)) {
                sum2 -= 5;
            }

            else {
                sum2 += p2_1+p2_2;
            }
            System.out.println("Score Player 2: "+  sum2);
            System.out.println();

            if(sum1>sum2){
                System.out.println("Player 1 wins.");
            }
            else if(sum2>sum1){
                System.out.println("Player 2 wins.");
            }
            else{
                System.out.println("Draw!");
            }
        }


    }
