package Tasks.Task_07th_July_UsingAbstruct_and_Interface.Interface_Programs;

public class P6_Multiple_Inheritance_UsingInterfaces {
    public static void main(String[] args) {

        Document d1 = new Document();
        d1.print();
        d1.print();

    }
}

interface Printable {
    // print method
    void print();
}

interface Showable {
    // show method
    void show();
}

class Document implements Printable, Showable {

    // Overriding print method
    @Override
    public void print() {
        System.out.println("Printing Document");
    }

    // Overriding show method
    @Override
    public void show() {
        System.out.println("Showing Document");
    }
}