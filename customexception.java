package training;

import java.util.Scanner;


class InvalidUserException extends Exception{

    @Override
    public String getMessage() {
        return "Invalid Details .............Try Again";
    }
    
}

class ATM{
    private int cardNUM = 1452;
    private int pin = 1010;

    int a,b;

    void AcceptInput(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the card number");

        a= sc.nextInt();
        System.out.println("Enter the pin number");
        b=sc.nextInt();
    }

    void validate()throws InvalidUserException
    {
        if(a==cardNUM&&b==pin){
            System.out.println("Collect Your cash");
        }
        else{
            InvalidUserException iue=new InvalidUserException();
            System.out.println(iue.getMessage());
            throw iue;
        }
    }
}

class Bank{
    ATM atm=new ATM();

    void check(){
        try {
            atm.AcceptInput();
            atm.validate();
        } catch (Exception e) {
            try {
            atm.AcceptInput();
            atm.validate();
        } catch (Exception e1) {
            try {
            atm.AcceptInput();
            atm.validate();
        } catch (Exception e2) {
            System.err.println("Your Card is Blocked");
        }
        }
        }
    }
}
public class customexception {
    public static void main(String[] args) {
        Bank b= new Bank();

        b.check();
    }
}
