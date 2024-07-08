import java.lang.Math;
import java.util.Scanner;

public class calculator {
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);

            System.out.println("No. of operation you want do :");
    int calc = t.nextInt();
        while(calc-->0){

        System.out.println("Enter the operands\n");
        float m = t.nextFloat();
        float n = t.nextFloat();
        System.out.println("Operation available :");
        System.out.println(" 1. Addition(+)");
        System.out.println(" 2. subtraction(-) ");
        System.out.println(" 3. Multiplication(*)");
        System.out.println(" 4. Division(/)");
        System.out.println(" 5. MODULUS(%)");
        System.out.println(" 6. Power(^)");
        System.out.println("\n");
        System.out.println("Enter the operation you want to perform");
        int k=t.nextInt();
        switch(k){
            case 1:
                System.out.println("Addition of two operands :"+(m+n));
                break;
            case 2:
                System.out.println("subtraction of two operands :"+(m-n));
                break;
            case 3:
                System.out.println("Multiplication of two operands :"+(m*n));
                break;
            case 4:
                System.out.println("Division of two operands :"+(m/n));
                break;
            case 5:
                System.out.println("MODULUS of two operands :"+(m%n));
                break;
            case 6:
                System.out.println("Power of two operands :"+(Math.pow(m,n)));
                break;
            default:
                System.out.println("Invalid operation you want to perform ");
                break;
        }
    }

}
}

