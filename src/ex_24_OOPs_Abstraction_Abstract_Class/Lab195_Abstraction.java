package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {

    public static void main(String[] args) {
        Car c1 = new Car();
        // Father f1 = new Father(); // This is abstract in nature.
        Child  child = new Child();
        Father  f2 = new Child(); // Dynamic Dispatch.
        child.loan50K();

    }


}

class Car{
    // This is concreate class
    // this doesn't have the abstract methods
    void done(){

    }
}

abstract class Father{
    // This is called the abstract function.
    abstract void loan50K();

    // as a complete function
    void loan25K(){
        System.out.println("Given the 25K");
    }
}

class Child extends Father{

    @Override
    void loan50K() {
        System.out.println("Son has to give the 50k loan");
    }
}