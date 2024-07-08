import java.lang.Math;
import java.util.Scanner;

public class if_else{
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);
        // assignment 6 qn.1
       System.out.println("Enter the length of the polygon");
        int length = t.nextInt();
        System.out.println("Enter the breadth of the polygon" );
        int breadth = t.nextInt();
        System.out.println("The polygon is :");
        if(length==breadth){
            System.out.println("Square");

        }
        else
            System.out.println("rectangle");


        // qn.2 alternative method of printing the absolute values

        System.out.println("Enter the any negative integer");
        int num = t.nextInt();
        System.out.println("the absolute value :"+ Math.abs(num));


       // solving this qn. using if else statements
        System.out.println("Enter the number you want :");
        int w = t.nextInt();
        if(w<0)
            System.out.println("value:"+(w*-1));
        else
            System.out.println("value :"+w);


        // Qn.3 Creating a calculator


        }

    }

