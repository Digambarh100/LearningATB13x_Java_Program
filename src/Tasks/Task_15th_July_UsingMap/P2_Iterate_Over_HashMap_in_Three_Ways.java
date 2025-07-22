package Tasks.Task_15th_July_UsingMap;

import java.util.*;

public class P2_Iterate_Over_HashMap_in_Three_Ways {
    public static void main(String[] args) {

        //Making HashMap common for all 3 classes
        Map <String, String> m1 = new HashMap();
        m1.put("Name", "Dipak");
        m1.put("Role", "Tester");
        m1.put("Level", "Senior");

        //Creating Objects from there corresponding classes with references
        System.out.println("Using Entry-set: ");
        EntrySet e1 = new EntrySet();
        e1.entryset(m1);

        System.out.println("----------------");
        System.out.println("Using Key-set: ");
        Keyset k1 = new Keyset();
        k1.keyset(m1);

        System.out.println("----------------");
        System.out.println("Using Iterator: ");
        MyIterator i1 = new MyIterator();
        i1.iterator(m1);

    }
}

class EntrySet {

    void entryset(Map<String, String> m1){

        //EntrySet Syntax
        for (Map.Entry<String, String> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

class Keyset {

    void keyset(Map<String, String> m1) {

        //KeySet Syntax
        for(String key : m1.keySet()) {
            System.out.println(key + " -> " + m1.get(key));
        }
    }
}

class MyIterator {

    void iterator(Map<String, String> m1) {

        //Iterator Syntax
        Iterator<Map.Entry<String, String>> iterator = m1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
