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
4. specialised methods cannot be accessed directly using interface type reference
5. if a class partially implements interface it must declare itself as abstract
6. A class can have multiple interface because diamond shape problem does not exist as interface does not have a parent
7. An interface cannot implement another interface, because interface cannot provide body
8. An interface can inherit from another interface.Not only this it can inherit from multiple interfaces because daimond shape problem does not exist multiple inheritance in java can be indirectly achieved by using multiple interface 
9. A class can both extend another class as well as implement instance.However it extends first and then implemnets instance then extends
10. An interface can conatin costant variable and method signatures. A variable within an interface ia automatically public static final
11. An empty interface in java is referred toa s marked interface or tagged interface. it is used to provide special properties to the object of the class/
12. An object of an interface cannot be created because an interface is a collection of abstract methods. however reference can be created so that loose coupling, polymorphism and its advantages can be achieved
*/
