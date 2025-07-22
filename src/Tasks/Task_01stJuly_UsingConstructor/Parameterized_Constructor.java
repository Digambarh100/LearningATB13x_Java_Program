package Tasks.Task_01stJuly_UsingConstructor;

public class Parameterized_Constructor {
    public static void main(String[] args) {
        Human a1 = new Human("Sita",26);
        System.out.println(a1.name);
        System.out.println(a1.age);
    }

}

class Human {
    String name;
    int age;

    Human (String name_user, int age_user) {

        this.name = name_user;
        this.age = age_user;

    }
}