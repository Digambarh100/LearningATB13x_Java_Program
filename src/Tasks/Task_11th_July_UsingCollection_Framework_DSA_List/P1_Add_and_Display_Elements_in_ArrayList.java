package Tasks.Task_11th_July_UsingCollection_Framework_DSA_List;

import java.util.ArrayList;

public class P1_Add_and_Display_Elements_in_ArrayList {
    public static void main(String[] args) {

        // Created an ArrayList
        ArrayList student = new ArrayList();

        //Adding student names
        student.add("Dipak");
        student.add("Ravi");
        student.add("Sneha");
        student.add("Priya");
        student.add("Anjali");

        // Displaying all names using a loop
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
    }
}
