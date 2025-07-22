package Fun_Programs.General;

import java.util.Scanner;

public class Lab_Fun_Password_Checking_Code {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String allowedSpecials = "@$%&";

        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.next();

            boolean hasUpper = false, hasLower = false, hasDigit = false, hasAllowedSpecial = false, hasInvalid = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) hasUpper = true;
                else if (Character.isLowerCase(c)) hasLower = true;
                else if (Character.isDigit(c)) hasDigit = true;
                else if (allowedSpecials.indexOf(c) >= 0) hasAllowedSpecial = true;
                else hasInvalid = true;
            }

            // Print specific messages for missing rules
            if (!hasUpper) System.out.println("Missing uppercase letter.");
            if (!hasLower) System.out.println("Missing lowercase letter.");
            if (!hasDigit) System.out.println("Missing number.");
            if (!hasAllowedSpecial) System.out.println("Missing allowed special character (@, $, %, &).");
            if (hasInvalid) System.out.println("Contains invalid special character(s).");
            if (password.length() < 8) System.out.println("Password must be at least 8 characters long.");


            // Use ternary operator for the result
            String result = (password.length() >= 8 && hasUpper && hasLower && hasDigit && hasAllowedSpecial && !hasInvalid)
                    ? "Password is valid!"
                    : "Invalid password! Try again.\n";

            System.out.println(result);

            if (result.equals("Password is valid!")) break;
        }
    }
}
