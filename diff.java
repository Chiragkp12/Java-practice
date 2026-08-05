import java.util.Scanner ;

public class diff {
    public static void printDiff(int[]arr,int k)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]-arr[j]==k || arr[j]-arr[i]==k)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
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

        int k = scan.nextInt();

        printDiff(arr,k);

    }
}