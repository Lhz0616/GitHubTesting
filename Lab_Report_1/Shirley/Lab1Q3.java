import java.util.Scanner;

public class Lab1Q3 {
    //chosen xd
    public static void main(String[] args) {


                Scanner scan = new Scanner(System.in);
                System.out.print("Enter Input Line1 : ");
                String input1 = scan.nextLine();
                System.out.print("Enter Input Line2 : ");
                String input2 = scan.nextLine();

                String[] arrOfinput1 = input1.split("[x+y=]+");
                String[] arrOfinput2 = input2.split("[x+y=]+");

                //array1
                int size = arrOfinput1.length;
                int[] arr1 = new int[size];
                for (int i = 0; i < size; i++) {
                    arr1[i] = Integer.parseInt(arrOfinput1[i]);
                }
                //array2
                int size2 = arrOfinput2.length;
                int[] arr2 = new int[size2];
                for (int i = 0; i < size2; i++) {
                    arr2[i] = Integer.parseInt(arrOfinput2[i]);
                }
                if (arr1[0] < -9 || arr1[1] < -9 || arr2[0] < -9 || arr2[1] < -9 || arr1[0] > 9 || arr1[1] > 9 || arr2[0] > 9 || arr2[1] > 9) {
                    System.out.println("The input is invalid");
                    return;
                }
                //ax+by=e , cx+dy=f; x= (ed-bf)/(ad-bc), y=(af-ec)/(ad-bc)
                if ((((arr1[0] * arr2[1]) - (arr1[1] * arr2[0]))) == 0)
                    System.out.println("The equation has no solution");

                else {
                    int x = (((arr1[2] * arr2[1]) - (arr1[1] * arr2[2])) / ((arr1[0] * arr2[1]) - (arr1[1] * arr2[0])));
                    int y = (((arr1[0] * arr2[2]) - (arr1[2] * arr2[0])) / ((arr1[0] * arr2[1]) - (arr1[1] * arr2[0])));
                    System.out.println("x=" + x);
                    System.out.println("y=" + y);
                }
            }
        }
