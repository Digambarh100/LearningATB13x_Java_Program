package Tasks.Task_03rd_July_UsingPolymorphism.Method_Overriding;

public class LoginFunctionality {
    public static void main(String[] args) {

        User u1 = new User();
        u1.login();

        AdminUser a1 = new AdminUser();
        a1.login();

        RegularUser r1 = new RegularUser();
        r1.login();

        // Dynamic method dispatch
        User b1 = new AdminUser();
        b1.login();
    }
}

class User {
    void login() {
        System.out.println("User login");
    }
}

class AdminUser extends User {
    void login() {
        System.out.println("This is Admin User!");
    }
}

class RegularUser extends User {
    void login() {
        System.out.println("This is Regular User!");
    }
}