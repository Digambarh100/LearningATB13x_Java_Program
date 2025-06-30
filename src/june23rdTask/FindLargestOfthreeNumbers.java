package june23rdTask;

public class FindLargestOfthreeNumbers {

    public static void main(String[] args) {
        int a=40;
        int b=366;
        int c=9;

        int max=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }
}
