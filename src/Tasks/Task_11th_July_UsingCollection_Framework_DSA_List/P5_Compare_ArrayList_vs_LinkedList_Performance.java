package Tasks.Task_11th_July_UsingCollection_Framework_DSA_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P5_Compare_ArrayList_vs_LinkedList_Performance {
    public static void main(String[] args) {

        // Measures time taken by ArrayList
        long startTime = System.currentTimeMillis();
        Array.arrayList();
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList Time: " + (endTime - startTime) + " ms");

        // Measures time taken by LinkedList
        startTime = System.currentTimeMillis();
        Linked.linkedList();
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList Time: " + (endTime - startTime) + " ms");
    }
}

class Array {
    static void arrayList() {

        List<Integer> list1 = new ArrayList<>();
        for(int i = 1; i <= 100000; i++) {
            list1.add(i);
        }

    }
}

class Linked {
    static void linkedList() {

        List<Integer> list2 = new LinkedList<>();
        for(int i = 1; i <= 100000; i++) {
            list2.add(i);
        }

    }
}
