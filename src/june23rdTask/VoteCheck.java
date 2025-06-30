package june23rdTask;

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age");
        int age = scanner.nextInt();

        boolean canVote = age > 17 ? true : false;
        System.out.println(canVote);
    }
}
