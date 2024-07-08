import java.util.Arrays;
import java.util.Scanner;
public class question {
    static int[] smallestLargest(int[]arr){
        Arrays.sort(arr);
        int[]ans={arr[0],arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
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
        int [] temp = smallestLargest(arr);
        System.out.println("smallest no."+temp[0]);
        System.out.println("largest no."+temp[1]);
    }
}