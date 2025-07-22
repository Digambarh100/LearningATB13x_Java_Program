package Tasks.Task_04th_July_UsingAccessModifier_and_Super;

public class P6_Protected_Access_Modifier {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.doEat();
    }
}
 class Animal1 {

     protected void eat() {
         System.out.println("Animal is eating!!!");
     }
 }

 class Dog extends Animal1 {

    void doEat() {
        eat();
    }
 }