import java.util.Scanner;
import java.util.Arrays;
public class reversed2d_array {
    static void printmatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] reverse2d_array(int[][]arr,int r,int c){
        int k=0;
        int m=0;
        int [][] ans = new int[m][k];
          for(int i=0;i<r ;i++){
            for (int j=(c-1);j>=1;j--){
                ans[m][k++]=arr[i][j];

            }
            m++;
        }
      //  printmatrix(arr);
        return ans;
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
        System.out.println("ARRAY A:");
        printmatrix(a);
        System.out.println("reversed array ARRAY A :");
        int ans[][]=reverse2d_array(a,r,c);
        System.out.println(ans);
    }
}
