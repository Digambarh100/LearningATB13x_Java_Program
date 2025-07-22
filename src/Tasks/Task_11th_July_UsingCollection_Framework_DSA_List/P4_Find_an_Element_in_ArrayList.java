package Tasks.Task_11th_July_UsingCollection_Framework_DSA_List;

import java.util.ArrayList;
import java.util.Scanner;

public class P4_Find_an_Element_in_ArrayList {
    public static void main(String[] args) {

        //Takes input from User
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name: ");
        String name = scanner.next();

        // Capitalize the first letter and remaining letters to smaller cases
        String result = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        System.out.println("Entered City is " +result);

        //Created a ArrayList
        ArrayList cities = new ArrayList();

        //Added city names
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");

        //Looped the ArrayList to print if entered city is on the list or not
        if (cities.contains(result)) {
            System.out.println("Congratulations!!! " + result + " is on the list \uD83E\uDD73\uD83C\uDF8A ");
        } else {
            System.out.println(result + " is not on the list!");
        }

        scanner.close();

    }
}
