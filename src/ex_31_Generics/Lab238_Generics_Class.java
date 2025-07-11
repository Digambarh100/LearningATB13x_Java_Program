package ex_31_Generics;

public class Lab238_Generics_Class {
    public static void main(String[] args) {
        GenericClass g = new GenericClass(10);
        GenericClass g1 = new GenericClass("Pramod");
        GenericClass g2= new GenericClass(true);
        GenericClass g3 = new GenericClass(3.14);

        // T -> it is placeholder only -> it can be any data type.

    }
}


class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}