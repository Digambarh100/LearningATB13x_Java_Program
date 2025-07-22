package Tasks.Task_27th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P25_Determine_the_Type_of_Website_Based_on_Domain {
    public static void main(String[] args) {
        //  Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Website URL (example.com, example.org, example.edu, example.gov etc):");

        String WebsiteUrl = scanner.next();


        if (WebsiteUrl.endsWith(".com")) {
            System.out.println("The website type is: Commercial website.");
        } else if (WebsiteUrl.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization.");
        } else if (WebsiteUrl.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution.");
        } else if (WebsiteUrl.endsWith(".gov")) {
            System.out.println("The website type is: Government website.");
        } else if (WebsiteUrl.endsWith(".net")) {
            System.out.println("The website type is:  Network-related website.");
        } else if (WebsiteUrl.endsWith(".info")) {
            System.out.println("The website type is: Informational website.");
        } else if (WebsiteUrl.endsWith(".xyz")) {
            System.out.println("The website type is: Unknown or other types of websites");
        } else {
            System.out.println("Invalid!!!");
        }

    }
}
