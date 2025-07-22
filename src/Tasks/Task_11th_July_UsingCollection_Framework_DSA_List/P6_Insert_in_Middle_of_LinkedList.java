package Tasks.Task_11th_July_UsingCollection_Framework_DSA_List;

import java.util.LinkedList;
import java.util.List;

public class P6_Insert_in_Middle_of_LinkedList {
    public static void main(String[] args) {

        System.out.println("===========================================================================");
        System.out.println("Creating LinkedList and adding each elements individual:");
        System.out.println("===========================================================================");

        Add.normalAdd();

        System.out.println("===========================================================================");
        System.out.println("Creating LinkedList and adding elements all at once using ListOf():");
        System.out.println("===========================================================================");

        ListOf.listOf();

        System.out.println("===========================================================================");
    }
}

class Add {

    static void normalAdd() {

        List fruits = new LinkedList();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Before Adding Orange: " +fruits);

        fruits.add(1, "Orange");

        System.out.println("After Adding Orange at index - 1: " +fruits);

    }
}

class ListOf {

    static void listOf() {
        List fruits = new LinkedList<>(List.of("Apple","Banana","Mango"));

        System.out.println("Before Adding Orange: " +fruits);

        fruits.add(1, "Orange");

        System.out.println("After Adding Orange at index - 1: " +fruits);
    }
}
