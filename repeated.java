import java.util.Arrays;
import java.util.Scanner;

class Repeated {

    public static void mergeAndSort(int[] arr, int[] ar) {
        int[] arrr = new int[arr.length + ar.length];

        for (int i = 0; i < arr.length; i++) {
            arrr[i] = arr[i];
        }

        for (int i = 0; i < ar.length; i++) {
            arrr[arr.length + i] = ar[i];
        }
               
        Arrays.sort(arrr);

        System.out.println("Merged and Sorted Array:");     
        for (int num : arrr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of Array 1: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter the size of Array 2: ");
        int m = scan.nextInt();
        int[] ar = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            ar[i] = scan.nextInt();
        }

        mergeAndSort(arr, ar);

        scan.close();
    }
}