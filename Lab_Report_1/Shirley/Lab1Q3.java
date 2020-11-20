import java.util.Scanner;

public class Lab1Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Input Line1 : ");
        String input1 = scan.nextLine();
        System.out.print("Enter Input Line2 : ");
        String input2 = scan.nextLine();

        String[] equation1 = input1.split("[x+y=]+");
        String[] equation2 = input2.split("[x+y=]+");

        // Parse String to int
        int size = equation1.length;
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = Integer.parseInt(equation1[i]);
        }

        int size2 = equation2.length;
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = Integer.parseInt(equation2[i]);
        }

        // follow the equation to declare the variables
        int a = arr1[0], b= arr1[1], e = arr1[2];
        int c = arr2[0], d = arr2[1], f = arr2[2];

        if (a < -9 || b < -9 || c < -9 || d < -9 || a > 9 || b > 9 || c > 9 || d > 9) {
            System.out.println("The input is invalid");
            return;
        }

        //ax+by=e , cx+dy=f; x= (ed-bf)/(ad-bc), y=(af-ec)/(ad-bc)
        // if ad - bc returns 0, then it will print out "The equation has no solution"
        if ((a * d - b * c) == 0) System.out.println("The equation has no solution");

        else {
            int x = (e * d) - (b * f)/ (a * d) - (b * c);
            int y = (a * f) - (e * c)/ (a * d) - (b * c);
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }
    }
}
