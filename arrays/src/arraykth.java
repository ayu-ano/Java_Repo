import java.util.Arrays;
import java.util.Scanner;

public class arraykth {
        static int[] kthsmallestLargest(int[]arr,int k){
            Arrays.sort(arr);
            int[]ans={arr[0 +k-1],arr[arr.length-1-(k-1)]};
            return ans;
        }

        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the kth value for the array");
            int x = s.nextInt();
            System.out.println("Enter the size of the array");
            int n = s.nextInt();
            int []arr = new int[n];
            System.out.println("Enter the arrays elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=s.nextInt();
            }
            System.out.println("printig the arrays elements");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            System.out.println("sorted arrays is :");
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            int [] temp = kthsmallestLargest(arr,x);
            System.out.println("smallest no."+x +"th of the array is :"  +temp[0]);
            System.out.println("largest no."+x+"th of the array is "+temp[1]);
        }
    }

