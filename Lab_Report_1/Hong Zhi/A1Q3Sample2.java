package Assignment.LabReport1;

import java.util.*;

public class A1Q3Sample2 {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        String [] eq1Element ;
        String [] eq2Element ;

        System.out.print("Enter Input Line 1 : ");
        String equation1 = scanner.nextLine();

        eq1Element = equation1.split("[x+y=]");
        String [] actual1Element = new String[3];
        int counter = 0;
        System.out.println(Arrays.toString(eq1Element));
        for(int i = 0, k = 0; i<eq1Element.length; i++){
            if(eq1Element[i].equals("")) continue;

            else actual1Element[k++] = eq1Element[i];
        }

        System.out.println(Arrays.toString(actual1Element))

        ;
        /*System.out.print("Enter Input Line 2 : ");
        String equation2 = scanner.nextLine();*/

        /*StringTokenizer st = new StringTokenizer(equation1, "x+y=");
        int counter= 0;*/


        /*StringTokenizer st1 = new StringTokenizer(equation2, "x+y=");
        counter = 0;
        while(st1.hasMoreTokens()){
            eq2Element[counter++] = Integer.parseInt(st1.nextToken());
        }*/


        /*int a = eq1Element.get(0), b = eq1Element.get(1), e = eq1Element.get(2);*/
        /*int c = eq2Element[0], d = eq2Element[1], f = eq2Element[2];*/

        /*System.out.println(a + " " + b + " " + e);*/
        /*if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else {
            int x = (e * d - b * f) / (a * d - b * c);
            int y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x="+x);
            System.out.println("y="+y);
        }*/
    }
}
