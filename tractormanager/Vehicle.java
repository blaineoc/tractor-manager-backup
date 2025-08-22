package ie.atu.tractormanager;

/**
 * Abstract base class representing a general vehicle.
 * Used as the parent class for all tractor types.
 */
public abstract class Vehicle {
    private String vin;
    private int age;
    private boolean registered;

    /**
     * Constructor for Vehicle.
     * 
     * @param vin        Vehicle Identification Number
     * @param age        Age of the vehicle
     * @param registered Whether the vehicle is registered
     */
    public Vehicle(String vin, int age, boolean registered) {
        this.vin = vin;
        this.age = age;
        this.registered = registered;
    }

    public String getVin() {
        return vin;
    }

    public int getAge() {
        return age;
    }

    public boolean isRegistered() {
        return registered;
    }

    @Override
    public String toString() {
        return "VIN: " + vin + ", Age: " + age + ", Registered: " + registered;
    }

    /**
     * Abstract method for performing maintenance.
     * Must be implemented by subclasses.
     */
    public abstract void performMaintenance();
}
