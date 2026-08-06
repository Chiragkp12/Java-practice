package training;

class Charger{
    private String brand;
    private float voltage;

    public Charger(String brand, float voltage){
        this.brand = brand;
        this.voltage = voltage;

    }
    

    public String getBrand(){
        return brand;
    }

    

    public float getVoltage(){
        return voltage;
    }
}

class os{
    private String name;
    private float size;

    public os(String name, float size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }   

    public float getSize(){
        return size;
    }
}

class Mobile{
    
    //while using composition use the object 
    os os=new  os("Android", 20.0f);

    //while using aggregation use the reference variable or create a method 
    void hasACharger(Charger c){
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}


public class day15 {

    public static void main(String[] args) {

        Mobile m = new Mobile();
        Charger c = new Charger("Samsung", 30.0f);
    
        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());

        m.hasACharger(c);
    }
}
