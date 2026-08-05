import java.util.Scanner;

class BusinessMan{
    float si;
    float p;
    float r;
    float t;
    void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        p = sc.nextFloat();
        System.out.println("Enter the rate of interest: ");
        r = sc.nextFloat();
        System.out.println("Enter the time period: ");
        t = sc.nextFloat();
    }
    float calculateSimpleInterest(float p, float r, float t){
        float si = (p * r * t) / 100;
        return si;
    }
}

class day13{
    public static void main(String[] args) {
        BusinessMan b = new BusinessMan();
        b.acceptInput();
        b.si = b.calculateSimpleInterest(b.p, b.r, b.t);
        System.out.println("The simple interest is: " + b.si);
    }
}