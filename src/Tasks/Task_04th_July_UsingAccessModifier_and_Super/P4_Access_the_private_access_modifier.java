package Tasks.Task_04th_July_UsingAccessModifier_and_Super;

public class P4_Access_the_private_access_modifier {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Lipi");
        System.out.println("Student Name: " + s1.getName());

        s1.setRollno("1502106022");
        System.out.println("Student Rollno: " + s1.getRollno());
    }
}

class Student {
    private String name;

    //Select Variable and left click -> generate -> setter and getter -> ok
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String rollno;

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }


}