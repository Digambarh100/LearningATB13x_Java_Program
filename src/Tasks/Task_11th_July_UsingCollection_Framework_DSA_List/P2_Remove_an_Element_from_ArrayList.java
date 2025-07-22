package Tasks.Task_11th_July_UsingCollection_Framework_DSA_List;

import java.util.ArrayList;

public class P2_Remove_an_Element_from_ArrayList {
    public static void main(String[] args) {

        //Creating ArrayList
        ArrayList names = new ArrayList();

        //Adding names
        names.add("Amit");
        names.add("Neha");
        names.add("Suresh");

        System.out.println("Before Removing a element: " +names);

        //Removing Neha from ArrayList by using the object value or index
        //names.remove("Neha");
        names.remove(1);

        System.out.println("After Removing a element: " +names);
    }
}
