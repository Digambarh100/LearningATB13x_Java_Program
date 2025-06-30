package June24thTask;

public class CheckLeapyear {

    public static void main(String[] args) {
        int year = 2100;
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {

        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        if (year % 400 != 0) {
            return false;
        }
        return true;
    }
}
