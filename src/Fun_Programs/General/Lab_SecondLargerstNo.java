package Fun_Programs.General;

public class Lab_SecondLargerstNo {
    public static void main(String[] args) {
        int[] numbers = {45, -10, 22, 98, 67, 98, 35, -7, 67, 12};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        // One loop, all logic inside
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            // If current > largest, update secondLargest and largest
            largest = current > largest ? current : largest;
            secondLargest = (current < largest && current > secondLargest) || secondLargest == largest ? current : secondLargest;
        }

        // Print the results
        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);

        // Print indexes of second largest
        System.out.print("Second largest found at index(es): ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] == secondLargest ? i + " " : "");
        }
        System.out.println(); // New line
    }
}
