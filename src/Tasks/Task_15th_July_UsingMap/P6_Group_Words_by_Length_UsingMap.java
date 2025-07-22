package Tasks.Task_15th_July_UsingMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P6_Group_Words_by_Length_UsingMap {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun", "cool", "Hi"};

        Map<Integer, List<String>> lengthMap = new HashMap<>();

        for (String word : words) {
            int len = word.length();

            // If length not present, create new list
            if (!lengthMap.containsKey(len)) {
                lengthMap.put(len, new ArrayList<>());
            }

            // Add word to the correct list
            lengthMap.get(len).add(word);
        }

        // Print grouped words
        for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
