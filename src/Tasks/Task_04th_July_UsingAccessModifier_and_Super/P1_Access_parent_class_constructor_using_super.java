package Tasks.Task_04th_July_UsingAccessModifier_and_Super;
public class P1_Access_parent_class_constructor_using_super {

    public static void main(String[] args) {
        child c1 = new child();
        child c2 = new child(3);

    }
}

class Parent {
    int gold = 10;
    int house = 1;
    int car = 2;

    Parent(){
        System.out.println("Default constructor - Own 1 villa");
    }

    Parent(int a) {
        System.out.println("Parametrized constructor - Own Cinema Theatre - " + a);
    }

}

class child extends Parent{

    child(){
        super();
    }

    child(int a){
        super(2);
    }

}
