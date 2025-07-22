package Tasks.Task_07th_July_UsingAbstruct_and_Interface.Interface_Programs;

public class P8_Interface_Constants {
    public static void main(String[] args) {

        CarSpeed c1 = new CarSpeed();
        c1.display();

    }
}

interface SpeedLimit {
    int MAX_SPEED = 120;
}

class CarSpeed implements SpeedLimit {

    void display() {
        System.out.println("Max Speed is: " + MAX_SPEED);
    }

}
