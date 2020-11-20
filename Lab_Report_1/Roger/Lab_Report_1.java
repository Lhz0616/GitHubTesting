import java.util.Scanner;

public class Lab_Report_1 {

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three integer number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double result=0;
        System.out.print("Enter two operands:");
        char operator1 = sc.next().charAt(0);
        char operator2 = sc.next().charAt(0);
        if (operator1=='X') {
            switch(operator2) {
                case 'X':
                    result=a*b*c;
                    break;
                case 'D':
                    result=(a*b)/c;
                    break;
                case 'M':
                    result=(a*b)%c;
                    break;
                case 'A':
                    result=(a*b)+c;
                    break;
                case 'S':
                    result=(a*b)-c;
                    break;
            }
        }else if(operator1=='D') {
            switch(operator2) {
                case 'X':
                    result=(a/b)*c;
                    break;
                case 'D':
                    result=(a/b)/c;
                    break;
                case 'M':
                    result=(a/b)%c;
                    break;
                case 'A':
                    result=(a/b)+c;
                    break;
                case 'S':
                    result=(a/b)-c;
                    break;
            }
        }else if(operator1=='M') {
            switch(operator2) {
                case 'X':
                    result=(a%b)*c;
                    break;
                case 'D':
                    result=(a%b)/c;
                    break;
                case 'M':
                    result=(a%b)%c;
                    break;
                case 'A':
                    result=(a%b)+c;
                    break;
                case 'S':
                    result=(a%b)-c;
                    break;
            }
        }else if(operator1=='A') {
            switch(operator2) {
                case 'X':
                    result=a+(b*c);
                    break;
                case 'D':
                    result=a+(b/c);
                    break;
                case 'M':
                    result=a+(b%c);
                    break;
                case 'A':
                    result=a+b+c;
                    break;
                case 'S':
                    result=a+b-c;
                    break;
            }
        }else if(operator1=='S') {
            switch(operator2) {
                case 'X':
                    result=a-(b*c);
                    break;
                case 'D':
                    result=a-(b/c);
                    break;
                case 'M':
                    result=a-(b%c);
                    break;
                case 'A':
                    result=(a-b)+c;
                    break;
                case 'S':
                    result=(a-b)-c;
                    break;
            }
        }
        sc.close();
        System.out.print(a+" "+operator1+" "+b+" "+operator2+" "+c+"="+(int)result);
    }

}

