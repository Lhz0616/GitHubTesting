/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labreport1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LabReport1Q3 {

    public static void main(String[] args) {

        //initialise
        Scanner sc = new Scanner(System.in);
        String input1, input2;
        int a, b, c, d, e, f;
        double x, y;

        System.out.println("Please enter two input line in format ax+by=e and cx+y=f");
        System.out.print("Enter Input Line 1: ");
        input1 = sc.nextLine();
        System.out.print("Enter Input Line 2: ");
        input2 = sc.nextLine();

        a = Integer.parseInt(String.valueOf(input1.charAt(0)));
        System.out.println(a);
        b = Integer.parseInt(String.valueOf(input1.charAt(0)));
        c = Integer.parseInt(String.valueOf(input2.charAt(3)));
        d = Integer.parseInt(String.valueOf(input2.charAt(3)));
        e = Integer.parseInt(String.valueOf(input1.substring(6)));
        f = Integer.parseInt(String.valueOf(input2.substring(6)));

        if (((a * d) - (b * c)) == 0) {
            System.out.println("The equation has no solution");

        } else {
            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("The value of x is: " + x);
            System.out.println("The value of y is: " + y);
        }

    }

}
