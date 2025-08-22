package ie.atu.tractormanager;

// Represents a tractor used in industry settings
public class IndustrialTractor extends Tractor {
    public IndustrialTractor(String vin, int age, boolean registered, int horsepower) {
        super(vin, age, registered, horsepower);
    }

    // Example method unique to IndustrialTractor
    public void liftHeavyLoad() {
        System.out.println("Lifting heavy equipment...");
    }

    @Override
    public String toString() {
        return "Industrial Tractor - " + super.toString();
    }

@Override
public void performMaintenance() {
    System.out.println("Industrial tractor maintenance done.");
}
}