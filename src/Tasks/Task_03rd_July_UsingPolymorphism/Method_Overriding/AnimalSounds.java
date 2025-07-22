package Tasks.Task_03rd_July_UsingPolymorphism.Method_Overriding;

public class AnimalSounds {
    public static void main(String[] args) {
        // Animal sounds
        Animal a1 = new Animal();
        a1.sound();

        //Dog sound
        Dog d1 = new Dog();
        d1.sound();

        // Cow sound
        Cow c1 = new Cow();
        c1.sound();

        //Cat sound
        Cat b1 = new Cat();
        b1.sound();

        // Dynamic method dispatch
        Animal e1 = new Dog();
        e1.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("moo, meow, bark");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
