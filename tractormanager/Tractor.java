package ie.atu.tractormanager;

public abstract class Tractor extends Vehicle {
    private int horsepower;

    public Tractor(String vin, int age, boolean registered, int horsepower) {
        super(vin, age, registered);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return super.toString() + ", Horsepower: " + horsepower;
    }
}
