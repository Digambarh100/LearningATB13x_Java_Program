package Tasks.Task_07th_July_UsingAbstruct_and_Interface.Abstract_Programs;

public class P3_Abstract_Class_WithConstructor {
    public static void main(String[] args) {
        Company c1 = new Company("Lipi");
        c1.IdCard();
    }
}

abstract class Employee {

    String EmployeeName;

    // Constructor
    Employee(String name) {
       this.EmployeeName = name;
        System.out.println("Employee Name: " + EmployeeName);
    }

    // Method
    abstract void IdCard();
}

class Company extends Employee {

    Company (String name) {
        super(name);
    }

    @Override
    void IdCard() {
        System.out.println("IdCard No: 1657298");
    }
}