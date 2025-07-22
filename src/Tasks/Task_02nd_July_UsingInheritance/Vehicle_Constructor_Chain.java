package Tasks.Task_02nd_July_UsingInheritance;

public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {
        Bike b1 = new Bike();

    }
}

class Vehicle {
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle {

    Bike() {
        System.out.println("Bike is ready");
    }
}