
class Plane {
    void takeoff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {

    @Override
    void takeoff() {
        System.out.println("Cargo plane is taking off");
    }

    @Override
    void fly() {
        System.out.println("Cargo plane is flying");
    }

    @Override
    void land() {
        System.out.println("Cargo plane is landing");
    }

   
}

class PassengerPlane extends Plane {

    @Override
    void takeoff() {
        System.out.println("Passenger plane is taking off");
    }

    @Override
    void fly() {
        System.out.println("Passenger plane is flying");
    }

    @Override
    void land() {
        System.out.println("Passenger plane is landing");
    }

    
}

class FighterPlane extends Plane {

    @Override
    void takeoff() {
        System.out.println("Fighter plane is taking off");
    }

    @Override
    void fly() {
        System.out.println("Fighter plane is flying");
    }

    @Override
    void land() {
        System.out.println("Fighter plane is landing");
    }

    
}

class Airport{
    void permit(Plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}

public class polymorphism{
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport kia = new Airport();
        

        Plane ref;

        ref = cp;
        kia.permit(cp);

        ref = pp;
        kia.permit(pp);

        ref = fp;
        kia.permit(fp);
        
    }
}

