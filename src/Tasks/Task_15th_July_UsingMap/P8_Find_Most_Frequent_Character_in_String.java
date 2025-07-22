package Tasks.Task_15th_July_UsingMap;

import java.util.HashMap;
import java.util.Map;

public class P8_Find_Most_Frequent_Character_in_String {
    public static void main(String[] args) {

        String input = "aaaabbbcc";

        //Each character is looped & counting each character repeated how many times???
        Map<Character, Integer> m1 = new HashMap<>();
        for (char c : input.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        int maxFreq = 0;
        char mostFreqChar = 0;

        // Find most reapted character
        for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFreqChar = entry.getKey();
            }
        }

        System.out.println("Most frequent character is: " + mostFreqChar + " -> " + maxFreq + " times");
    }
}
