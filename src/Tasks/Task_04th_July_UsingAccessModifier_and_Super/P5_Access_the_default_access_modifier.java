package Tasks.Task_04th_July_UsingAccessModifier_and_Super;

public class P5_Access_the_default_access_modifier {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.showDetails();

    }
}

class Student1 {

    void showDetails() {
        System.out.println("Default Modifier!!!");
    }

}

class TestDefault {

    void test() {
        Student1 s2 = new Student1();
        s2.showDetails();
    }

}