import java.util.Scanner;
import java.util.Arrays;
public class array2D_addition {
    static void printmatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r, int c, int[][] b, int r1, int c1) {
        if (r != r1 || c != c1) {
            System.out.println("Invalid input you cannot able to print array additon");
            return;
        }
        int[][] addi = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                addi[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }
        System.out.println("Addition two matrices wil be like this :");
        printmatrix(addi);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row no. for the array A:");
        int r = s.nextInt();
        System.out.println("Enter the columns no. for the array A:");
        int c = s.nextInt();
        System.out.println("Enter the element in the array which is as follows :");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the row no. for the array B:");
        int r1 = s.nextInt();
        System.out.println("Enter the columns no. for the array B:");
        int c1 = s.nextInt();
        int b[][] = new int[r1][c1];
        System.out.println("Enter the element in the array B which is as follows :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                b[i][j] = s.nextInt();
            }

        }
        System.out.println("ARRAY A:");
        printmatrix(a);
        System.out.println("ARRAY B:");
        printmatrix(b);
        add(a,r,c,b,r1,c1);

    }
}
