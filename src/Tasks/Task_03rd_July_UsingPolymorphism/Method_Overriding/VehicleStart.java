package Tasks.Task_03rd_July_UsingPolymorphism.Method_Overriding;

public class VehicleStart {
    public static void main(String[] args) {
        //Vechile start sound
        Vehicle v1 = new Vehicle();
        v1.start();

        //Bike start sound override vechiles
        Bike b1 = new Bike();
        b1.start();

        //Car start sound override vechiles
        Car c1 = new Car();
        c1.start();

        //Dynamic method dispatch
        Vehicle a1 = new Car();
        a1.start();
    }
}

class Vehicle {
    void start() {
        System.out.println("Default Start!!!");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Turn the key to start the car");
    }
}