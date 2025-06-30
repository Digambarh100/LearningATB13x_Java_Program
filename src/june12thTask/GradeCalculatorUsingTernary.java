package june12thTask;

public class GradeCalculatorUsingTernary {

    public static void main(String[] args) {
        //    Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

        int marks=100;
        String grade=marks>89?"A+":(marks>74?"A":(marks>59?"B":(marks>39?"C":"Fail")));
        System.out.println(grade);
    }
}
