/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.Arrays;
import java.util.Scanner;

//chosen

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //read a three integer numbers as String
        System.out.print("Enter three integer numbers: ");
        String numberInput = sc.nextLine();

        // read a line of two operands as String
        System.out.print("Enter two operands: ");
        String operandInput = sc.nextLine();

        //split three integers input by users into an array with size 3
        String[] numStr = numberInput.split(" ", 3);

        //split two operands input by users into an array with size 2
        String[] ope = operandInput.split(" ", 2);

        // create three variables n1, n2, n3 to store all three integers in numStr array and set them as int data type for further calculation
        int n1 = Integer.parseInt(numStr[0]);
        int n2 = Integer.parseInt(numStr[1]);
        int n3 = Integer.parseInt(numStr[2]);

        // create two variables o1, o2 to store two operands in ope array
        String o1 = ope[0];
        String o2 = ope[1];

        //initialize result=0
        double result = 0;

        //nested if statements. First if statement catch o1 and inside got another five if statements for different situation of o2
        //calculation of result based on different pais of operands
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

        //nested if statements. First if statement catch o1 and inside got another five if statements for different situation of o2
        //calculation of result based on different pais of operands
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

        //nested if statements. First if statement catch o1 and inside got another five if statements for different situation of o2
        //calculation of result based on different pais of operands
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

        //nested if statements. First if statement catch o1 and inside got another five if statements for different situation of o2
        //calculation of result based on different pais of operands
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

        //nested if statements. First if statement catch o1 and inside got another five if statements for different situation of o2
        //calculation of result based on different pais of operands
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

        //Print the output
        System.out.println(n1+" "+o1+" "+n2+" "+o2+" "+n3+" = "+result);

    }
    
}
