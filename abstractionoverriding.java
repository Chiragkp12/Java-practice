package training;


abstract class Bird {
    abstract void eat();
    abstract void fly();
}

abstract class Eagle extends Bird {
    @Override
    void fly(){
        System.out.println("Eagle will fly");
    }   
}

class SerpentEagle extends Eagle{
    @Override
    void eat() {
        System.out.println("Serpent Eagle eats Snakes");
    }
}

class GoldenEagle extends Eagle{
    @Override
    void eat() {
        System.out.println("Golden Eagle eats small mammals");
    }
}

class Abstraction {
    public static void main(String[] args) {
        SerpentEagle se = new SerpentEagle();
        se.eat();
        se.fly();

        GoldenEagle ge = new GoldenEagle();
        ge.eat();  
        ge.fly();
    }
}



