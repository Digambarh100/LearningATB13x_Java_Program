package ex_32_Collection_Framework_DSA.Map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating TreeMap
        Map<String, Integer> values = new TreeMap();
        // Insert elements (note the order)
        values.put("Second", 2);
        values.put("First", 1);
        values.put("Third", 3);
        System.out.println("TreeMap (sorted by keys): " + values);

        // Replacing values
        values.replace("First", 11);
        values.replace("Second", 22);


        System.out.println("After replacement: " + values);

        // Remove element
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
        System.out.println("Final map: " + values);


    }
}
