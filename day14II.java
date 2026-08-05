
class Test1{
    int a,b;

    public Test1(){
        a = 100;
        b = 200;
    }

    public Test1(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class Test2 extends Test1{
    int x,y;

    public Test2(){
        x = 300;
        y = 400;
    }

    public Test2(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}



public class day14II{
    public static void main(String[] args) {
        Test2 t = new Test2(9,99);
        t.display();

        Test2 t2 = new Test2();
        t2.display();
    }
    
}
