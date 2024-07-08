import java.util.Scanner;
import java.util.Arrays;
public class mul_matrix_2d {
    static void printmatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
   static void mul_mat(int[][] a, int r, int c, int[][] b, int r1, int c1){ // time complexity is O(n^3)
        if (c!=r1){
            System.out.println("multiplication is not possible here!");
            return;// we write return to terminate from the program if condition become true
        }
       int[][]mul = new int[r][c1];
       for (int i = 0; i < r; i++) {
           for (int j = 0; j < c1; j++) {
               for(int k=0;k<c;k++) {
                   /* this additional loop is used for the addition part like mul[0][0]=a[0][0]*b[0][0]+
               a[0][1]*b[1][0] here we observe that ith row of the A matrix is not change in the whole addition process
               whereas in the b matrix jth column is remains same as  mul matrix only column of and row of the b matrix is changes

                                        */
                   mul[i][j] += a[i][k] * b[k][j];
               }
           }
           System.out.println();
       }
       System.out.println("multiplication matrix : ");
       printmatrix(mul);
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
        mul_mat(a,r,c,b,r1,c1);

    }
}
