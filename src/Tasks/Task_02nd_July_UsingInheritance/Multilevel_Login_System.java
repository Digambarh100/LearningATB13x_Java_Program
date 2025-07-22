package Tasks.Task_02nd_July_UsingInheritance;

public class Multilevel_Login_System {
    public static void main(String[] args) {
        SuperAdmin a1 = new SuperAdmin();
        a1.shutdownSystem();
        a1.accessAdminPanel();
        a1.login();
    }
}

class User {
    void login() {
        System.out.println("This is User");
    }
}

class AdminUser extends User {
    void accessAdminPanel() {
        System.out.println("This is AdminUser");
    }
}

class SuperAdmin extends AdminUser {
    void shutdownSystem() {
        System.out.println("This is SuperAdminUser");
    }
}