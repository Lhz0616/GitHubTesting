package Assignment.LabReport1;

import java.util.Scanner;
import java.util.StringTokenizer;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class A1Q3 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int [] eq1Element = new int[3];
        int [] eq2Element = new int[3];

        System.out.print("Enter Input Line 1 : ");
        String equation1 = scanner.nextLine();

        System.out.print("Enter Input Line 2 : ");
        String equation2 = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(equation1, "x+y=");
        System.out.println(st);
        
        int counter= 0;
        while(st.hasMoreTokens()){
            eq1Element[counter++] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(equation2, "x+y=");
        counter = 0;
        while(st1.hasMoreTokens()){
            eq2Element[counter++] = Integer.parseInt(st1.nextToken());
        }

        int a = eq1Element[0], b = eq1Element[1], e = eq1Element[2];
        int c = eq2Element[0], d = eq2Element[1], f = eq2Element[2];

        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else {
            int x = (e * d - b * f) / (a * d - b * c);
            int y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
    }
}
