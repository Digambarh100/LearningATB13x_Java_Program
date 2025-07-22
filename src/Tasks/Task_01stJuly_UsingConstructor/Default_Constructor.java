package Tasks.Task_01stJuly_UsingConstructor;

public class Default_Constructor {
    public static void main(String[] args) {
        Goat a1 = new Goat();
        System.out.println(a1.name);
        System.out.println(a1.age);
    }
}

class Goat {

    String name;
    int age;

    Goat() {
        name = "Unknown";
        age = 0;
    }

}