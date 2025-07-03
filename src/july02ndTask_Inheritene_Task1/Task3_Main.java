package july02ndTask_Inheritene_Task1;

/*
✅ Task 3: "Multilevel Login System"

📄 Description: (Multilevel Inheritance)

Create a class User with a method login().
Extend it with a class AdminUser that adds a method accessAdminPanel().
Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().

Use an object of SuperAdmin to call all three methods.
 */
public class Task3_Main {
    public static void main(String[] args) {
        SuperAdmin sa = new SuperAdmin();
        sa.login();
        sa.accessAdminPanel();
        sa.shutdownSystem();


    }
}

class User {

    void login() {

        System.out.println("This is the User Class-login");

    }
}

class AdminUser extends User {
    void accessAdminPanel() {
        System.out.println("This is the AdminUser-accessAdminPanel");
    }

}

class SuperAdmin extends AdminUser {
    void shutdownSystem() {
        System.out.println("This is the SuperAdmin-shutdownSystem");
    }
}


