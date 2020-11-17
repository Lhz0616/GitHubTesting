import java.util.Scanner;

public class Lab1Q1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three integer number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.print("Enter two operands: ");
        char operand1 =scan.next().charAt(0);
        char operand2 =scan.next().charAt(0);

        //X operand included
        if(operand1=='X' && operand2=='D'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1*num2)/num3));
        }
        else if(operand1=='D' && operand2=='X'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1/(num2*num3)));
        }

        else if(operand1=='X' && operand2=='M'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1*num2)%num3));
        }
        else if(operand1=='M' && operand2=='X'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1%(num2*num3)));
        }
        else if(operand1=='X' && operand2=='A'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1*num2)+num3));
        }
        else if(operand1=='A' && operand2=='X'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1+(num2*num3)));
        }
        else if(operand1=='X' && operand2=='S'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1*num2)-num3));
        }
        else if(operand1=='S' && operand2=='X'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1-(num2*num3)));
        }
        else if(operand1=='X' && operand2=='X'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1*num2)*num3));
        }

        //D operand included
        else if(operand1=='D' && operand2=='M'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1/num2)%num3));
        }
        else if(operand1=='M' && operand2=='D'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1%(num2/num3)));
        }
        else if(operand1=='D' && operand2=='A'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1/num2)+num3));
        }
        else if(operand1=='A' && operand2=='D'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1+(num2/num3)));
        }
        else if(operand1=='D' && operand2=='S'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1/num2)-num3));
        }
        else if(operand1=='S' && operand2=='D'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1-(num2/num3)));
        }
        else if(operand1=='D' && operand2=='D'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1/num2)/num3));
        }

        //M operand included
        else if(operand1=='M' && operand2=='A'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1%num2)+num3));
        }
        else if(operand1=='A' && operand2=='M'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1+(num2%num3)));
        }
        else if(operand1=='M' && operand2=='S'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1%num2)-num3));
        }
        else if(operand1=='S' && operand2=='M'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1-(num2%num3)));
        }
        else if(operand1=='M' && operand2=='M'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1%num2)%num3));
        }

        //A operand included
        else if(operand1=='A' && operand2=='S'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1+num2)-num3));
        }
        else if(operand1=='S' && operand2=='A'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + (num1-(num2+num3)));
        }
        else if(operand1=='A' && operand2=='A'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1+num2)+num3));
        }

        //S operand included
        else if(operand1=='S' && operand2=='S'){
            System.out.println(num1 + " " + operand1 + " " +
                    num2 + " " + operand2 + " " + num3 + " = " + ((num1-num2)-num3));
        }
        //Invalid input
        else {
            System.out.println("Invalid input");
            return;
        }

    }
}
