import java.util.Scanner;
import java.util.Arrays;
public class prefixSuffixSum {
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        int [] prefix = new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    static int[] optimiseprfixSum(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    static int[] suffixsum(int[] arr){
        for(int i= (arr.length-2);i>=0;i--){
            arr[i]=arr[i+1]+arr[i];
        }
        return arr;
    }
    static void printarray(int[]arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("size of array");
        int n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements in array :");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
       int [] pref = prefixSum(arr);
        System.out.println("prefix array : ");
        printarray(pref);
       pref = optimiseprfixSum(arr);
        System.out.println("optimise prefix array : ");
        printarray(pref);
        // before try this you should comment out the code line 43 to 49 otherwise it will show the unwanted result.
        int []pref_1 =suffixsum(arr);
        System.out.println("optimise suffix sum array : ");
        printarray(pref_1);
    }
}
