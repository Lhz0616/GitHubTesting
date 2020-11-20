/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LabReport1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //initialise
        int[] num = new int[3];
        int first = 0;
        int ans;
        char[] operands = new char[2];
        Scanner sc = new Scanner(System.in);

        //input three integers and two operands
        System.out.print("Enter three integers number: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print("Enter two operands: ");
        for (int i = 0; i < operands.length; i++) {
            operands[i] = sc.next().charAt(0);

        }
        //process & output
        if (checkPrecedence(operands)) {
            ans = calculateTwoNumber(calculateTwoNumber(num[0], num[1], operands[0]), num[2], operands[1]);
        } else {
            ans = calculateTwoNumber(num[0], calculateTwoNumber(num[1], num[2], operands[1]), operands[0]);
        }
        System.out.println(num[0] + " " + operands[0] + " " + num[1] + " " + operands[1] + " " + num[2] + " = " + ans);
    }

    /*according to mathematical logic, (* / %)'s precedence are same level, and are higher than (+ -)
        so, we just check (* / %) vs ( + -) which one comes first, in the first operand or second operand
        if (* / %) comes first in the first operand, return true, else return false
     */
    public static boolean checkPrecedence(char[] o) {

        return !((o[0] == 'A' || o[0] == 'S') && (o[1] == 'X' || o[1] == 'D' || o[1] == 'M'));

    }

    //method to calulate the operation
    public static int calculateTwoNumber(int x, int y, char op) {
        int ans = 0;
        switch (op) {
            case 'X':
                ans = x * y;
                break;
            case 'D':
                ans = x / y;
                break;
            case 'M':
                ans = x % y;
                break;
            case 'A':
                ans = x + y;
                break;
            case 'S':
                ans = x - y;
                break;
            default:
                break;
        }
        return ans;
    }
}
