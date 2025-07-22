package Tasks.Task_04th_July_UsingAccessModifier_and_Super.P7_anotherPackage_To_Test_PublicAcessModifier;

import Tasks.Task_04th_July_UsingAccessModifier_and_Super.Student4;

public class Externalclass {
    public static void main(String[] args) {
        Student4 s3 = new Student4();
        s3.showInfo(); // Accessible - it's public
    }

}
