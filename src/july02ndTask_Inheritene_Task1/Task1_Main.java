package july02ndTask_Inheritene_Task1;

/*
 ✅ Task 1: "Animal Sound Simulator"

📄 Description:  (Single Inheritance + Method Call)

 Create a base class Animal with a method makeSound().
 Then create a derived class Cat that has a method meow().
 In the main method, call both methods using the Cat object.
 */
public class Task1_Main {

    public static void main(String[] args) {


        july02ndTask_Inheritene_Task1.cat c = new july02ndTask_Inheritene_Task1.cat();


        c.makeSound();
        c.meow();
    }
}

class Animal {

    void makeSound() {
        System.out.println("Parent class - Animal");
    }
}

class cat extends july02ndTask_Inheritene_Task1.Animal {

    void meow() {
        System.out.println("child class - Cat: Makes meow sound");

    }


}
