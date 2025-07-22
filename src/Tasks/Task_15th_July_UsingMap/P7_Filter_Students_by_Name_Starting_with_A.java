package Tasks.Task_15th_July_UsingMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class P7_Filter_Students_by_Name_Starting_with_A {
    public static void main(String[] args) {

        Map<Integer, String> m1 = new HashMap<>();
        m1.put(101, "Anjali");
        m1.put(102, "Dipak");
        m1.put(103, "Aman");
        m1.put(104, "Ravi");

        System.out.println("Students name started by A: ");

        // Checks each Value which starts with "A"
        for (Map.Entry<Integer, String> entry : m1.entrySet()) {
            if (entry.getValue().startsWith("A")) {
                System.out.println(entry.getKey() + " -> " +entry.getValue());
            }

        }
    }
}
