package lap_05.task01;

public class Vehicle {

    private String plateNum;
    private int maxSpeed;
    private int curentSpeed;

    public Vehicle(String plateNum, int maxSpeed) {
        this.plateNum = plateNum;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(int delta) {
        curentSpeed += delta;
    }

    public void brake(int delta) {
        curentSpeed -= delta;
    }

    public String info() {
        return (
            "Vehicle{Plate number: " +
            plateNum +
            ", max speed: " +
            maxSpeed +
            ", current speed: " +
            curentSpeed +
            "}"
        );
    }
}
