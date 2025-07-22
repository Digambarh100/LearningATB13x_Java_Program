package Tasks.Task_15th_July_UsingMap;

import java.util.*;

public class P1_Word_Frequency_Counter_UsingHashMap {
    public static void main(String[] args) {

        String input = "java is easy and java is powerful";

        // Split the sentence into words
        String[] words = input.split(" ");

        Map <String, Integer> FreqCou = new HashMap();

        // Loop through the words
        for (String word : words) {
            if (FreqCou.containsKey(word)) {
                FreqCou.put(word, FreqCou.get(word) + 1);
            } else {
                FreqCou.put(word, 1);
            }
        }

        // Print the word frequencies
        for (String key : FreqCou.keySet()) {
            System.out.println(key + " -> " + FreqCou.get(key));
        }
    }
}
