import java.util.Scanner;

public class A1Q1 {

    // X, D, M, A, S
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.print("Enter three integer number : ");
        String num = input.nextLine();

        String [] operand = num.split(" ");
        int x = Integer.parseInt(operand[0]);
        int y = Integer.parseInt(operand[1]);
        int z = Integer.parseInt(operand[2]);

        System.out.print("Enter two operand : ");
        String operator = input.nextLine();

        String [] op = operator.split(" ");
        String a = op[0];
        String b = op[1];

        int temp = 0;

        for(int i = 0; i< op.length; i++){
            if(a.equals("X") || a.equals("D") || a.equals("M") || b.equals("X") || b.equals("D") || b.equals("M")){

                if(a.equals("X") || b.equals("X")){
                    if(a.equals("X")){
                        if(i == 0) temp = x*y;
                        else result = temp * x;
                        a = "";
                    }
                    else if(b.equals("X")){
                        if(i == 0) temp = y*z;
                        else result = temp * z;
                        b = "";
                    }
                }

                else if(a.equals("D") || b.equals("D")){
                    if(a.equals("D")){
                        if(i==0) temp = x/y;
                        else result = x/temp;
                        a = "";
                    }
                    else if(b.equals("D")){
                        if(i == 0) temp = y/z;
                        else result = temp / z;
                        b = "";
                    }
                }

                else if(a.equals("M") || b.equals("M")){
                    if(a.equals("M")){
                        if(i == 0)temp = x % y;
                        else result = x % temp;
                        a = "";
                    }

                    else if(b.equals("M")) {
                        if(i == 0) temp = y % z;
                        else result = temp % z;
                        b = "";
                    }
                }

            } else{
                if(a.equals("A")){
                    if(b.equals("A")) result = x+y+z;
                    else if(b.equals("S")) result = x+y-z;
                    else result = temp + x;
                }

                else if(b.equals("A")){
                    if(a.equals("A")) result = x+y+z;
                    else if(a.equals("S")) result = x-y+z;
                    else result = temp + z;
                }
            }
        }
        System.out.println(x + " " + op[0] + " " + y + " " + op[1] + " " + z + " = " + result);

    }
}
