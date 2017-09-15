public class Car extends Vehicle {
    private boolean isConvertible;

    // Default constructor
    public Car() {
        this("", "", 0, 0, 0, false, false);
    }

    public Car(String make, String model, int modelYear, int retailPrice, int mpg, boolean isFourWD, boolean isConvertible) {
        super(make, model, modelYear, retailPrice, mpg, isFourWD);
        this.isConvertible = isConvertible;
    }

    /**
     * Is the car a convertible?
     * @return true or false if the car is a convertible
     */
    public boolean isConvertible() {
        return isConvertible;
    }

    // Setter for isConvertible
    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    /**
     * Prints out the vehicle characteristics in a user-friendly format.
     */
    public void printVehicle() {
        super.printVehicle();
        if (isConvertible()) System.out.println("Convertible");
        else System.out.println("Not A Convertible");
    }
}
