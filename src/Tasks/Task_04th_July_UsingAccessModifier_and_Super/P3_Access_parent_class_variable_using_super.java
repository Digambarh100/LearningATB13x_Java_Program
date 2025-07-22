package Tasks.Task_04th_July_UsingAccessModifier_and_Super;

public class P3_Access_parent_class_variable_using_super {
    public static void main(String[] args) {
        Son1 s1 = new Son1();
        s1.Assets();
    }
}

class Parent1{
    int sheeps = 100;
    int goats = 150;
    int cows = 20;

}

class Son1 extends Parent1 {
     int tractor = 100;

     void Assets() {
         System.out.println("Son1 sheeps owned - " + sheeps);
         System.out.println("Son1 goats owned - " + goats);
         System.out.println("Son1 cows owned - " + cows);
         System.out.println("Son1 tractors owned - " + tractor);
     }
}