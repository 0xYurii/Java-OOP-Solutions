package lap_04;

public class SmartThermostat {

    String location;
    Double currentTemp;
    Double targetTemp;
    boolean ecoMode;
    boolean isOn;

    public SmartThermostat() {
        this.location = "Unknown";
        this.currentTemp = 20.0;
        this.targetTemp = 22.0;
        this.ecoMode = false;
        this.isOn = false;
    }

    public SmartThermostat(
        String location,
        Double currentTemp,
        Double targetTemp,
        boolean ecoMode,
        boolean isOn
    ) {
        this.location = location;
        this.currentTemp = currentTemp;
        this.targetTemp = targetTemp;
        this.ecoMode = ecoMode;
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean setTargetTemp(Double t) {
        targetTemp = t;
        return true;
    }

    public void toggleEcoMode() {
        ecoMode = !ecoMode;
    }

    public void step(Double outsideTemp) {
        if (!isOn) {
            currentTemp = outsideTemp;
        } else {
            Double diff = currentTemp - targetTemp;
            Double adjustment = 0.5;
            
            if (ecoMode) {
                adjustment = 0.2;
            }
            
            if (diff > 0) {
                currentTemp -= adjustment;
            } else if (diff < 0) {
                currentTemp += adjustment;
            }
            
            currentTemp = Math.max(outsideTemp - 5, Math.min(currentTemp, outsideTemp + 5));
        }
    }

    public String status() {
        String state = isOn ? "ON" : "OFF";
        String mode = ecoMode ? "ECO" : "NORMAL";
        return String.format("[%s] %s | Current: %.1f°C | Target: %.1f°C | Mode: %s",
                location, state, currentTemp, targetTemp, mode);
    }

    public static void main(String[] args) {
        SmartThermostat thermostat = new SmartThermostat("Living Room", 18.0, 22.0, false, true);
        
        System.out.println("SmartThermostat Simulation - 20 Steps");
        System.out.println("====================================");
        
        for (int step = 1; step <= 20; step++) {
            Double outsideTemp = 15.0 + (step % 5) * 2.0;
            thermostat.step(outsideTemp);
            System.out.printf("Step %2d (Outside: %.1f°C) - %s%n", step, outsideTemp, thermostat.status());
        }
    }
}
