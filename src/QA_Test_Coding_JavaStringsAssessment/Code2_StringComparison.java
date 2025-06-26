package QA_Test_Coding_JavaStringsAssessment;

//Create a program that demonstrates different ways to compare strings in Java,
// including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
public class Code2_StringComparison {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Pune";
        String str2 = "Pune";
        String str3 = new String("Pune");
        String str4 = "pune";

        // 1. Using == (Reference Comparison)
        System.out.println("== Operator:");
        System.out.println("str1 == str2: " + (str1 == str2));   // true (same reference from string pool)
        System.out.println("str1 == str3: " + (str1 == str3));   // false (new object in heap)

        // 2. Using equals() (Content Comparison)
        System.out.println("\n.equals() Method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false (case-sensitive)

        // 3. Using equalsIgnoreCase() (Case-Insensitive Comparison)
        System.out.println("\n.equalsIgnoreCase() Method:");
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // 4. Using compareTo() (Lexicographical Comparison)
        System.out.println("\n.compareTo() Method:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // Negative value
        System.out.println("str4.compareTo(str1): " + str4.compareTo(str1)); // Positive value
    }
}


