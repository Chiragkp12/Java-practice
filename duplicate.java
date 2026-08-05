import java.util.Scanner ;

public class duplicate{
    
    public static void printduplicate(int[] arr) {
        

        for (int i = 0; i < arr.length - 1; i++) {
            while(arr[i] != arr[i + 1]){
                System.out.println(arr[i] );
            } 
        }

        System.out.println(arr[arr.length - 1]);
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

        printduplicate(arr);

        scan.close();
    }
}