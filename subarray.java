import java.util.Scanner;

class subarray {

    public static void subarray(int[] arr, int k) {
        for(int i = 0; i <=arr.length; i++) {
            int sum = 0;
            
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k) {
                    for(int l = i; l <= j; l++) {
                        System.out.print(arr[l] + " ");
                    }
                    System.out.println();
                }
            }
            }
            
    }
    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }

        

        subarray(arr,9);

        scan.close();
    }
}