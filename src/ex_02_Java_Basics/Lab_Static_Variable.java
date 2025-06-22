package ex_02_Java_Basics;


/*  static Keyword -
   It is used for memory management.
 It can be applied to variable, method and static block.
 It means single copy storage
  ∙ If the value of a variable is not varied from object to object such type of
 variables is not recommended to declare as instance variables. We have to
 declare such type of variables at class level by using static modifier.
 ∙ In the case of instance variables for every object a separate copy will be
 created but in the case of static variables for entire class only one copy will be
 created and shared by every object of that class.
 ∙ Static variables will be crated at the time of class loading and destroyed at the
 time of class unloading hence the scope of the static variable is exactly same as
 the scope of the .class file.
 ∙ Static variables will be stored in method area. Static variables should be
 declared with in the class directly but outside of any method or block or
 constructor.
 ∙ We can access static variables either by class name or by object reference but
 usage of class name is recommended.
 ∙ But within the same class it is not required to use class name we can access
 directly
 if variable is not static , user can not all varibale with class name and direcyly
  For the static variables it is not required to perform initialization explicitly, JVM
 will always provide default values
 */
public class Lab_Static_Variable {
   // static int i=10;
    static int i=10;
    static int b;  // not required to perform initialization explicitly, JVM will always provide default values
    public static void main(String[] args) {
        Lab_Static_Variable t = new Lab_Static_Variable();
        System.out.println(t.i);//10
        System.out.println(Lab_Static_Variable.i);//10
        System.out.println(i);//10

        System.out.println(b);  // 0  -> default value of int
    }

}
