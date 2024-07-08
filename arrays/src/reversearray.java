import java.util.Scanner;
import java.util.Arrays;

public class reversearray {
    static void swap_array(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }
    static void reverse_inplace(int[]arr){
        int j=arr.length-1;
        for(int i =0;i<j;i++){
            swap_array(arr ,i, j);
            j--;
        }

    }
    static void printarray(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int [] arr_1 ={1,2,3,45,6,67};
        for(int i=0;i<arr_1.length;i++) {
            System.out.println("array of"+"\t"+ i +"\t"+"hardcoded:"+arr_1[i]);
        }

        System.out.println("size of the array :");
        int n = m.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the arrays elements : ");
        for(int i=0;i<n;i++) {
        arr[i]= m.nextInt();
        }
        System.out.println("Original array :");
        printarray(arr);
       // System.out.println(arr);
        System.out.println("reversed array :");
        reverse_inplace(arr);

        printarray(arr);
      //  System.out.println(arr);
    }
}
