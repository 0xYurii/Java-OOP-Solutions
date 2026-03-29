package lap_05.task01;

public class Taxi extends Vehicle {

    private boolean meterOn;
    private double pricePerKm;

    public Taxi(String plateNum, int maxSpeed, double pricePerKm) {
        super(plateNum, maxSpeed);
        this.pricePerKm = pricePerKm;
    }

    public void startMeter() {
        meterOn = true;
    }

    public void stopMeter() {
        meterOn = false;
    }

    public String info() {
        return (
            "Taxi{" +
            super.info() +
            ", meterOn: " +
            meterOn +
            ", price per km: " +
            pricePerKm +
            "}"
        );
    }
}
