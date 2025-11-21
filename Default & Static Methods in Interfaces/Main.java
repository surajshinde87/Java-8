interface Vehicle {

    void start();
    
    default void engine(){
        System.out.println("Vehicle engine started");
    }
    
    static void service(){
        System.out.println("General vehicle service");
    }
}

interface ElectricVehicle {

    default void engine(){
        System.out.println("Electric engine running silently");
    }
    
}

class Car implements Vehicle, ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void engine() {
        Vehicle.super.engine();
        ElectricVehicle.super.engine();
    }

}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();         
        c.engine();

        Vehicle.service();  

    }
}