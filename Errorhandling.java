package training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class errorhandling {
   public static void main(String[] args) {
    System.out.println("Connection Established");
    try {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Numerator");
        int a=sc.nextInt();
        System.out.println("Enter The Denominator");
        int b=sc.nextInt();

        int c=a/b;
        System.out.println(c);

        System.out.println("Enter the Size of Array");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.print("Enter The Element");
        int element =sc.nextInt();

        System.out.println("Enter The Index");
        int index=sc.nextInt();
        arr[index]=element;

        arr=null;

        System.out.print("");

        


    } 
    catch(ArithmeticException ae){
        System.out.println("Enter a non Zero Denominaor");
    }
    catch(NegativeArraySizeException ne){
        System.out.println("Enter The Positive size");
    }
    catch(InputMismatchException ie){
        System.out.println("Enter a Valid Input");
    }
    catch(ArrayIndexOutOfBoundsException aie){
        System.out.println("Enter a valid Index");
    }
    catch (Exception e) {
        System.out.println("Invalid details");
    }

    System.out.println("Connection Terminated");
   }
}
