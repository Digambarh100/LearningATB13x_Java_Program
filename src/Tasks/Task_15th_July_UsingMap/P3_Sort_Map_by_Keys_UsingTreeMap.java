package Tasks.Task_15th_July_UsingMap;

import java.util.*;

public class P3_Sort_Map_by_Keys_UsingTreeMap {
    public static void main(String[] args) {

        // Created Hashmap, added some Key: Value pairs as elements
        Map <String, Integer> m1 = new HashMap();
        m1.put("Ravi", 80);
        m1.put("Anjali", 95);
        m1.put("Dipak", 75);

        //Converted HasMap to TreeMap for Automatic Natural way of Sorting
        Map <String, Integer> t1 = new TreeMap(m1);

        System.out.println("Converting HashMap to TreeMap:");

        //Using entrySet() Function to print all Key: Value pairs
        for(Map.Entry<String, Integer> entry : t1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
