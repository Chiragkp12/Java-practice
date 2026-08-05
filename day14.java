
class pet{

}

class Dog extends pet{

}


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
    void fly() {
        System.out.println("Cargo plane is flying");
    }

    void carryCargo() {
        System.out.println("Cargo plane is carrying cargo");
    }
}

class PassengerPlane extends Plane {

    @Override
    void fly() {
        System.out.println("Passenger plane is flying");
    }

    void carryPassengers() {
        System.out.println("Passenger plane is carrying passengers");
    }
}

class FighterPlane extends Plane {

    @Override
    void fly(int a) {
        System.out.println("Fighter plane is flying");
    }

    void carryWeapons() {
        System.out.println("Fighter plane is carrying weapons");
    
    }
}

public class day14 {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.carryCargo();
        cp.land();

        System.out.println();

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.carryPassengers();
        pp.land();

        System.out.println();

        FighterPlane fp = new FighterPlane();
        fp.takeoff();
        fp.fly();
        fp.carryWeapons();
        fp.land();
    }
}


/*rules for method overloading
1. Method name must be the same
2. No of parameters must be same
3. Data type of parameters must be same
4. it should have co vaiant return type
 */