package Tasks.Task_15th_July_UsingMap;

import java.util.HashMap;
import java.util.Map;


public class P4_CharacterFrequencyCounter {
    public static void main(String[] args) {

        String input = "aabbccddeeff";

        //Created a HashMap
        Map <Character, Integer> m1 = new HashMap();

        //Each character is looped
        for (char c : input.toCharArray()) {

            //counting each character repeated how many times???
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        System.out.println(m1);

    }
}
