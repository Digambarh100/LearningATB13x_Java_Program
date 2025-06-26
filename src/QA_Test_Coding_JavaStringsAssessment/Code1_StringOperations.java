package QA_Test_Coding_JavaStringsAssessment;

public class Code1_StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Infy";

        //Concatenation
        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = str1 + " " + str2;
        System.out.println(str4);


        // Length of the string

        System.out.println("Length : " + str3.length()); //9


        // Substring
        String sub = str3.substring(0, 3);
        System.out.println("Substring (first name): " + sub);  //Hel
//Character Extraction
        char ch = str3.charAt(3);
        System.out.println("Character at index 3: " + ch);

    }


}
