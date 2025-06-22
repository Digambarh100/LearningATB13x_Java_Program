package ex_02_Java_Basics;

public class Lab_Static_Variable_2 {
    int x=10;
    static int y=20;
    public static void main(String[] args)
    {
        Lab_Static_Variable_2  t1 = new Lab_Static_Variable_2();
        t1.x=888;
        t1.y=999;
        System.out.println(t1.x+"----"+t1.y);//888----999

        Lab_Static_Variable_2   t2 =new Lab_Static_Variable_2();
        System.out.println(t2.x+"----"+t2.y);//10----999

        Lab_Static_Variable_2   t3 =new Lab_Static_Variable_2();
        System.out.println(t3.x+"----"+t3.y);//10----999
    } }

