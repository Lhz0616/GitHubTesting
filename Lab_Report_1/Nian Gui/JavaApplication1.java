/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author chest
 */
import java.util.Arrays;
import java.util.Scanner;

//chosen

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three integer number: ");
        String numberInput = sc.nextLine();
        System.out.print("Enter two operands: ");
        String operandInput = sc.nextLine();
        
        String[] numStr = numberInput.split(" ", 3);
        String[] ope = operandInput.split(" ", 2);

        int n1 = Integer.parseInt(numStr[0]);
        int n2 = Integer.parseInt(numStr[1]);
        int n3 = Integer.parseInt(numStr[2]);
        String o1 = ope[0];
        String o2 = ope[1];
        double result = 0;
        
        if(o1.equals("X")){
            if(o2.equals("X")){
                result = (n1 * n2) * n3;
            }
            if(o2.equals("D")){
                result = (n1 * n2) / n3;
            }
            if(o2.equals("M")){
                result = (n1 * n2) % n3;
            }
            if(o2.equals("A")){
                result = (n1 * n2) + n3;
            }
            if(o2.equals("S")){
                result = (n1 * n2) - n3;
            }
        }
        
        if(o1.equals("D")){
            if(o2.equals("X")){
                result = n1 / (n2 * n3);
            }
            if(o2.equals("D")){
                result = (n1 / n2) / n3;
            }
            if(o2.equals("M")){
                result = (n1 / n2) % n3;
            }
            if(o2.equals("A")){
                result = (n1 / n2) + n3;
            }
            if(o2.equals("S")){
                result = (n1 / n2) - n3;
            }
        }
        
        if(o1.equals("M")){
            if(o2.equals("X")){
                result = n1 % (n2 * n3);
            }
            if(o2.equals("D")){
                result = n1 % (n2 / n3);
            }
            if(o2.equals("M")){
                result = (n1 % n2) % n3;
            }
            if(o2.equals("A")){
                result = (n1 % n2) + n3;
            }
            if(o2.equals("S")){
                result = (n1 % n2) - n3;
            }
        }
        
        if(o1.equals("A")){
            if(o2.equals("X")){
                result = n1 + (n2 * n3);
            }
            if(o2.equals("D")){
                result = n1 + (n2 / n3);
            }
            if(o2.equals("M")){
                result = n1 + (n2 % n3);
            }
            if(o2.equals("A")){
                result = (n1 + n2) + n3;
            }
            if(o2.equals("S")){
                result = (n1 + n2) - n3;
            }
        }
        
        if(o1.equals("S")){
            if(o2.equals("X")){
                result = n1 - (n2 * n3);
            }
            if(o2.equals("D")){
                result = n1 - (n2 / n3);
            }
            if(o2.equals("M")){
                result = n1 - (n2 % n3);
            }
            if(o2.equals("A")){
                result = n1 - (n2 + n3);
            }
            if(o2.equals("S")){
                result = (n1 - n2) - n3;
            }
        }

        System.out.println(n1+" "+o1+" "+n2+" "+o2+" "+n3+" = "+result);

    }
    
}
