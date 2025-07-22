package Tasks.Task_07th_July_UsingAbstruct_and_Interface.Abstract_Programs;

public class P1_Animal_Sound {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();

        Cats c1 = new Cats();
        c1.makeSound();
    }
}

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Bark!!!");
    }
}

class Cats extends Animal{

    @Override
    void makeSound() {
        System.out.println("Meow!!!");
    }
}