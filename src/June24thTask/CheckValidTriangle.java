package June24thTask;

public class CheckValidTriangle {

    public static void main(String[] args) {
        int a=2,b=2,c=4;

        if(a==0 || b==0 ||c==0){
            System.out.println("Triangle invalid");
        }
        else if(a+b>c && b+c>a && a+c>b){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("Invalid triangle");
        }
    }
}
