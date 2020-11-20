/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chest
 */
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, x, y;
        
        System.out.print("Enter Input Line 1: ");
        String equation1 = sc.nextLine();
        String[] temp1 = equation1.split("x", 2);
        a = Integer.parseInt(temp1[0]);
        String[] temp2 = temp1[1].split("y=", 2);
        b = Integer.parseInt(temp2[0]);
        e = Integer.parseInt(temp2[1]);
        
        System.out.print("Enter Input Line 2: ");
        String equation2 = sc.nextLine();
        String[] temp3 = equation2.split("x", 2);
        c = Integer.parseInt(temp3[0]);
        String[] temp4 = temp3[1].split("y=", 2);
        d = Integer.parseInt(temp4[0]);
        f = Integer.parseInt(temp4[1]);
        System.out.println(a+"_"+b+"_"+e);
        System.out.println(c+"_"+d+"_"+f);
        
        if (((a*d)-(b*c)) != 0){
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }
        else {
            System.out.println("The equation has no solution");
        }
        
    }
    
}
