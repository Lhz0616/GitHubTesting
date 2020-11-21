package NianGui;

/**
 * @author Tan Nian Gui
 */

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input the integer and operand
        System.out.print("Enter three integer number: ");
        String numberInput = sc.nextLine();
        System.out.print("Enter two operands: ");
        String operandInput = sc.nextLine();

        // process the user input
        String[] numStr = numberInput.split(" ", 3);
        String[] ope = operandInput.split(" ", 2);

        int n1 = Integer.parseInt(numStr[0]);
        int n2 = Integer.parseInt(numStr[1]);
        int n3 = Integer.parseInt(numStr[2]);
        String o1 = ope[0];
        String o2 = ope[1];
        double result = 0;

        // conduct the calculation according to the precedence
        // X D M A S in order
        if (o1.equals("X")) {
            if (o2.equals("X")) {
                result = (n1 * n2) * n3;
            }
            if (o2.equals("D")) {
                result = (n1 * n2) / n3;
            }
            if (o2.equals("M")) {
                result = (n1 * n2) % n3;
            }
            if (o2.equals("A")) {
                result = (n1 * n2) + n3;
            }
            if (o2.equals("S")) {
                result = (n1 * n2) - n3;
            }
        }

        if (o1.equals("D")) {
            if (o2.equals("X")) {
                result = n1 / (n2 * n3);
            }
            if (o2.equals("D")) {
                result = (n1 / n2) / n3;
            }
            if (o2.equals("M")) {
                result = (n1 / n2) % n3;
            }
            if (o2.equals("A")) {
                result = (n1 / n2) + n3;
            }
            if (o2.equals("S")) {
                result = (n1 / n2) - n3;
            }
        }

        if (o1.equals("M")) {
            if (o2.equals("X")) {
                result = n1 % (n2 * n3);
            }
            if (o2.equals("D")) {
                result = n1 % (n2 / n3);
            }
            if (o2.equals("M")) {
                result = (n1 % n2) % n3;
            }
            if (o2.equals("A")) {
                result = (n1 % n2) + n3;
            }
            if (o2.equals("S")) {
                result = (n1 % n2) - n3;
            }
        }

        if (o1.equals("A")) {
            if (o2.equals("X")) {
                result = n1 + (n2 * n3);
            }
            if (o2.equals("D")) {
                result = n1 + (n2 / n3);
            }
            if (o2.equals("M")) {
                result = n1 + (n2 % n3);
            }
            if (o2.equals("A")) {
                result = (n1 + n2) + n3;
            }
            if (o2.equals("S")) {
                result = (n1 + n2) - n3;
            }
        }

        if (o1.equals("S")) {
            if (o2.equals("X")) {
                result = n1 - (n2 * n3);
            }
            if (o2.equals("D")) {
                result = n1 - (n2 / n3);
            }
            if (o2.equals("M")) {
                result = n1 - (n2 % n3);
            }
            if (o2.equals("A")) {
                result = n1 - (n2 + n3);
            }
            if (o2.equals("S")) {
                result = (n1 - n2) - n3;
            }
        }

        // Print out the result of the calculation
        System.out.println(n1 + " " + o1 + " " + n2 + " " + o2 + " " + n3 + " = " + result);

    }

}
