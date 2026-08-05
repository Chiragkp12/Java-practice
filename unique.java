import java.util.Scanner ;

public class unique{
    
    public static void printunique(int[] arr) {
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if(count == 1) {
                    System.out.println(arr[i]);
                }
                count = 1;
            }
        }
        if(count == 1) {
            System.out.println(arr[arr.length - 1]);

        }
    }




    public static int printUnique(int[] arr) {
        int count = 1;
        int uniqueCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    System.out.println(arr[i]);
                    uniqueCount++;
                }
                count = 1;
            }
        }

        if (count == 1) {
            System.out.println(arr[arr.length - 1]);
            uniqueCount++;
        }

        return uniqueCount;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }


        int uniqueCount = printUnique(arr);
        System.out.println("unique Count: " + uniqueCount);

        scan.close();
    }
}