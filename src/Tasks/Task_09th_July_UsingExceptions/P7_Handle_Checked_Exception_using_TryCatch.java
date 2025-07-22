package Tasks.Task_09th_July_UsingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class P7_Handle_Checked_Exception_using_TryCatch {
    public static void main(String[] args) {

        try {
            FileReader a = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Caught Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

    }
}
