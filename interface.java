package training;
import java.util.Scanner;

interface calculator{
    void add();
    void sub();

}

class Mycalculator1 implements calculator{
    @Override
    public void add(){
        int a= 10;
        int b= 20;
        int c=a+b;
        System.out.println(c);
    }

    @Override
    public void sub(){
        int x=100;
        int y=50;
        int z=x-y;
        System.err.println(z);
    }
}


class Mycalculator2 implements calculator{
    @Override
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the value of a:");
        int a=sc.nextInt();
        System.err.println("Enter the value of b:");
        int b=sc.nextInt();

        int c= a+b;
        System.err.println(c);
        sc.close();
    }

    @Override
    public void sub(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the value of x:");
        int x=sc.nextInt();
        System.err.println("Enter the value of y:");
        int y=sc.nextInt();

        int z= x+y;
        System.err.println(z);

        sc.close();
    }
}

class Mycalculator3 implements calculator{

    @Override
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the value of a:");
        int a=sc.nextInt();
        System.err.println("Enter the value of b:");
        int b=sc.nextInt();

        if (a<b){
            int c= a+b;
            System.err.println(c);
        }
        sc.close();
    }

    @Override
    public void sub(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the value of x:");
        int x=sc.nextInt();
        System.err.println("Enter the value of y:");
        int y=sc.nextInt();
        sc.close();
    }
}
public class day16{
    public static void main(String[] args) {
        Mycalculator1 m1 =new Mycalculator1();
        Mycalculator2 m2 =new Mycalculator2();
        Mycalculator3 m3 =new Mycalculator3();

        m1.add();
        m1.sub();

        m2.add();
        m2.sub();

        m3.add();
        m3.sub();


    }
}

/*
Rule of interface
1. an Interface is like a contract, like when implemented,helps to achieve- standardization
2. Interface promote polymorphism by allowing an interface type refernce to point to object of implementing classes.its achieves loose coupling, rduces code and provide code flexibility
3. Methods within in an interface are automatically public and abstract.
4. 
*/
