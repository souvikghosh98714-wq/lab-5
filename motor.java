interface motor {

int capacity = 5;   // initialized (public static final by default)

void run();         
void consume();
}

// Correct implementation class
class WashingMachine implements Motor {

    public void run() {
        System.out.println("Motor is running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }

    public static void main(String args[]) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        // Correct access of interface variable
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}