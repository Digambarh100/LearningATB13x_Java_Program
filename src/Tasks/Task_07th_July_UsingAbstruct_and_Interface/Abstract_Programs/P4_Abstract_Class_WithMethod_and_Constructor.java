package Tasks.Task_07th_July_UsingAbstruct_and_Interface.Abstract_Programs;

public class P4_Abstract_Class_WithMethod_and_Constructor {
    public static void main(String[] args) {
        School s1 = new School("D Lipi Goud");
        s1.Rollno();
    }
}

abstract class Student {

    String StudentName;

    // Constructor
    Student(String name) {
        this.StudentName = name;
        System.out.println("Studennt Name: " +StudentName);
    }

    // Method
    abstract void Rollno();
}

class School extends Student {

    School (String name) {
        super(name);
    }

    @Override
    void Rollno() {
        System.out.println("Student Rollno: 1502106022");
    }
}
