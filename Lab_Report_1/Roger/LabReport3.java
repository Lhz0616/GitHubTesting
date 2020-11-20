import java.util.Scanner;

public class LabReport3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input Line 1: ");
        String line1 = sc.next();
        System.out.print("Enter Input Line 2: ");
        String line2 = sc.next();
        int a = Integer.parseInt(line1.substring(0,1));
        int b = Integer.parseInt(line1.substring(3,4));
        int c = Integer.parseInt(line2.substring(0,1));
        int d = Integer.parseInt(line2.substring(3,4));
        int e = Integer.parseInt(line1.substring(6,line1.length()));
        int f = Integer.parseInt(line2.substring(6,line2.length()));

        int x = (e*d-b*f)/(a*d-b*c);
        int y = (a*f-e*c)/(a*d-b*c);

        if(a*d-b*c==0){
        }
        else{
            System.out.println("x=" +x + "\n" +"y=" + y);
            System.out.println("The equation has no solution");
        }
        sc.close();
    }

}


