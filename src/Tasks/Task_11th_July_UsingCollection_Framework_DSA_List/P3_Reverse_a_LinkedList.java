package Tasks.Task_11th_July_UsingCollection_Framework_DSA_List;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P3_Reverse_a_LinkedList {
    public static void main(String[] args) {

        // Created LinkedList
        List list = new LinkedList();

        // Added wrapped integer literals (Autoboxing: int -> Integer)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("LinkedList: " +list);

        //Reverse the list
        Collections.reverse(list);

        System.out.println("Reversed List: " +list);
    }
}
