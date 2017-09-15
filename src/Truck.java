import java.text.NumberFormat;

public class Truck extends Vehicle {
    private boolean hasStepSide;
    private int towCapacity;

    // Default constructor
    public Truck() {
        this("", "", 0 ,0, 0, false, false, 0);
    }

    public Truck(String make, String model, int modelYear, int retailPrice, int mpg, boolean isFourWD, boolean hasStepSide, int towCapacity) {
        super(make, model, modelYear, retailPrice, mpg, isFourWD);
        this.hasStepSide = hasStepSide;
        this.towCapacity = towCapacity;
    }

    /**
     * Does the truck has a step side?
     * @return true if the truck has a step side, false if the truck does not have a step side
     */
    public boolean hasStepSide() {
        return hasStepSide;
    }

    // Setters
    public void setHasStepSide(boolean hasStepSide) {
        this.hasStepSide = hasStepSide;
    }

    public void setTowCapacity(int towCapacity) {
        this.towCapacity = towCapacity;
    }

    // Getter
    public int getTowCapacity() {
        return towCapacity;
    }

    /**
     * Prints out the vehicle characteristics in a user-friendly format.
     */
    public void printVehicle() {
        super.printVehicle();
        if (hasStepSide()) System.out.println("Has Side Step");
        else System.out.println("No Side Step");
        System.out.println("Tow up to " + ((double) towCapacity / 2000) + " tons");
    }
}
