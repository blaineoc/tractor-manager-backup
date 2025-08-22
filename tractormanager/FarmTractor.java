package ie.atu.tractormanager;

// This represents a tractor used on farms
public class FarmTractor extends Tractor {

    public FarmTractor(String vin, int age, boolean registered, int horsepower) {
        super(vin, age, registered, horsepower);
    }

    // Unique feature for farm tractors
    public void ploughField() {
        System.out.println("Ploughing the field...");
    }

    // This is needed because Vehicle is abstract
    @Override
    public void performMaintenance() {
        System.out.println("Greasing joints and checking hydraulics...");
    }

    @Override
    public String toString() {
        return "Farm Tractor - " + super.toString();
    }
}
