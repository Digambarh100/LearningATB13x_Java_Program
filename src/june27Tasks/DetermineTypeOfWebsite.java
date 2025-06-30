package june27Tasks;

import java.util.Scanner;

public class DetermineTypeOfWebsite {
//    Example Scenarios
//
//    Input: example.com
//
//    Output: The website type is: Commercial website
//
//    Input: example.org
//
//    Output: The website type is: Non-profit organization
//
//    Input: example.edu
//
//    Output: The website type is: Educational institution
//
//    Input: example.gov
//
//    Output: The website type is: Government website
//
//    Input: example.net
//
//    Output: The website type is: Network-related website
//
//    Input: example.info
//
//    Output: The website type is: Informational website
//
//    Input: example.xyz
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter website for ref: ");
        String website =scanner.nextLine();
    //   String website="example.xyz";
       if(website.endsWith("xyz")){
           System.out.println("Unknown website");
       }
        if(website.endsWith("info")){
            System.out.println("Info website");
        }
        if(website.endsWith("net")){
            System.out.println("network related website");
        }
        if(website.endsWith("gov")){
            System.out.println("Govt related website");
        }
        if(website.endsWith("edu")){
            System.out.println("Educational website");
        }

    }
}
