package training;

abstract class Demo extends Demo2{
    abstract void disp();
}

class Demo2 {
      void disp(){
    System.out.println("Hello");
    
}
}

class Demo3 extends Demo{
    
    @Override
    void disp(){
        System.out.println("Hi");
    }
}
class abstraction {
    public static void main(String args[]){
        Demo3 d = new Demo3();
        d.disp();
    }
}
/*
when an abstract method is declared in a class, that class must be declared as abstract. 
An abstract class can have abstract methods and concrete methods (methods with implementation). 
A concrete subclass must provide implementations for all abstract methods inherited from its abstract superclass.
if a subclass does not implement all abstract methods from its superclass, it must also be declared as abstract.
if class extends an abstract class and if override the abstract method then it is not necessary to declare the subclass as abstract.
static block can be extend to abstract class but cannot be declared as abstract.

 */