

/*in linear search it will return the index no. of the element which is found in the array
   otherwise if the element is not  present simply it will return -1 to the terminal */
import java.util.Scanner;
import java.util.Arrays;

public class linearsearch {
    static int linearSearch(int[] arr, int x) {
        int ans = -1;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {

                ans = i;
                System.out.println("yes ! Element is founded in index no. ");
                break;
            }

        }

            return ans;
        }
        static void print_matrix(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the Element no." + " " + i + " " + "of the array" + " ");
                System.out.println(arr[i]);
            }
            System.out.println();
        }
        public static void main (String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the value to be search in the array A:");
            int r = s.nextInt();
            System.out.println("Enter the elements for the array A:");
            int n = s.nextInt();
            System.out.println("Enter the element in the array which is as follows :");
            System.out.println();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the Element no." + " " + i + " " + "of the array" + " ");
                a[i] = s.nextInt();
            }
            print_matrix(a);
            System.out.println("Searched element is founded or not");
            int value = linearSearch(a, r);
            System.out.println(value);

        }
    }


