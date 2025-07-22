package Tasks.Task_15th_July_UsingMap;

import java.util.*;

public class P5_Find_First_NonRepeated_Character {
    public static void main(String[] args) {

        String input = "aabbccdeeff";

        Map <Character, Integer> m1 = new HashMap<>();

        //Each character is looped & counting each character repeated how many times???
        for(char c : input.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        System.out.println(m1);

        //Checks First non-repeated character
        for (Map.Entry<Character, Integer> entry: m1.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                return;
            }
        }
        System.out.println("There is no First Non - Repeated Character!!!");
    }
}
