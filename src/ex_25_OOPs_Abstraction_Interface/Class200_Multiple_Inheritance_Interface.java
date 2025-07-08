package ex_25_OOPs_Abstraction_Interface;

public class Class200_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money();
    }
}


interface Father1{
    void money();
}
interface Father2{
    void money();
}

class Child implements Father1,Father2{


    @Override
    public void money() {
        System.out.println("Child own Money!");
    }
}