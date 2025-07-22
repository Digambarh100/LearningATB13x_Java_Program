package Tasks.Task_07th_July_UsingAbstruct_and_Interface.Interface_Programs;

public class P7_Interface_WithDefault_and_Static_Method {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Vehicle.fuelType();
    }
}

interface Vehicle{

    default void start() {
        System.out.println("Vehicle started");
    }

    static void fuelType() {
        System.out.println("Fuel type is Petrol");
    }

}

class Car implements Vehicle {

}
