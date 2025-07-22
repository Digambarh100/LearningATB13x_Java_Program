package Tasks.Task_04th_July_UsingAccessModifier_and_Super;

public class P2_Access_parent_class_method_using_super {
    public static void main(String[] args) {
        personSon s1 = new personSon();
        s1.vechile();

    }
}

class Person {

    // Default Method
    void car(){
        System.out.println("#defaultMethod# Ferrari Car!!!");
    }

    // Public Method
    public void library(int a) {
        System.out.println("#publicMethod# Books - " + a);
    }

    //Private
    private void house() {
        System.out.println("#privateMethod# House");
    }

}

class personSon extends Person{

    void vechile() {
        super.car();
        super.library(500);
    }

}
