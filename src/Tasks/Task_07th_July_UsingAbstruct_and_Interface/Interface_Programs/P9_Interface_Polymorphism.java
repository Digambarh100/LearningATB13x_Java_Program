package Tasks.Task_07th_July_UsingAbstruct_and_Interface.Interface_Programs;

public class P9_Interface_Polymorphism {
    public static void main(String[] args) {

        // Interface reference
        Playable instrument;

        // Assign Guitar object
        instrument = new Guitar();
        instrument.play();

        // Assign Guitar object
        instrument = new Piano();
        instrument.play();
    }
}

interface Playable {
    void play();
}

class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Guitar!!!");
    }

}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Piano!!!");
    }

}