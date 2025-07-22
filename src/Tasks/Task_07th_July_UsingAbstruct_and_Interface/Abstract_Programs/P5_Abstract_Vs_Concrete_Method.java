package Tasks.Task_07th_July_UsingAbstruct_and_Interface.Abstract_Programs;

public class P5_Abstract_Vs_Concrete_Method {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
        c1.display();
    }
}

abstract class Parent{

    // abstract method
    abstract void show();

    // concrete method
    void display() {
        System.out.println("Concrete method in abstract class!!!");
    }

}

class Child extends Parent {

    // This is abstract method called from child class which is concrete in nature
    @Override
    void show() {
        System.out.println("Abstract method implemented!!!");
    }

}
