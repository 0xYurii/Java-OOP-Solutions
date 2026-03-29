package lap_05.task01;

public class Main {

    public static void main(String[] args) {
        // 1. Create a Taxi
        Taxi taxi = new Taxi("123-ALG", 180, 2.5);

        // 2. Print initial info
        System.out.println(taxi.info());

        // 3. Demonstrate accelerate
        taxi.accelerate(60);
        System.out.println("After accelerating: " + taxi.info());

        // 4. Demonstrate brake
        taxi.brake(20);
        System.out.println("After braking: " + taxi.info());

        // 5. Start the meter
        taxi.startMeter();
        System.out.println("Meter started: " + taxi.info());

        // 6. Stop the meter
        taxi.stopMeter();
        System.out.println("Meter stopped: " + taxi.info());
    }
}
