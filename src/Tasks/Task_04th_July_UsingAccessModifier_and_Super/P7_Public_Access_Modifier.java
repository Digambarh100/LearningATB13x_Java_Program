package Tasks.Task_04th_July_UsingAccessModifier_and_Super;


public class P7_Public_Access_Modifier {
    public static void main(String[] args) {

        // Access from Student4 class - Student4.java
        Student4 s1 = new Student4();
        s1.showInfo();

        // Access from another class in same package
        StudentUser user = new StudentUser();
        user.accessStudentInfo();
    }
}


// Another class in the same package
class StudentUser {
    void accessStudentInfo() {
        Student4 s2 = new Student4();
        s2.showInfo(); // Accessible because it's public
    }
}