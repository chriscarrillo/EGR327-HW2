import java.text.NumberFormat;

public class Vehicle {
    private String make;
    private String model;
    private int modelYear;
    private int retailPrice;
    private int mpg;
    private boolean isFourWD;

    // Default constructor
    public Vehicle() {
        this("", "", 0, 0, 0, false);
    }

    public Vehicle(String make, String model, int modelYear, int retailPrice, int mpg, boolean isFourWD) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
        this.retailPrice = retailPrice;
        this.mpg = mpg;
        this.isFourWD = isFourWD;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getMPG() {
        return mpg;
    }

    public boolean isFourWD() {
        return isFourWD;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setMPG(int mpg) {
        this.mpg = mpg;
    }

    public void setFourWD(boolean fourWD) {
        isFourWD = fourWD;
    }

    /**
     * Prints out the vehicle characteristics in a user-friendly format.
     */
    public void printVehicle() {
        System.out.println(getModelYear() + " " + getMake() + " " + getModel());
        if (isFourWD()) System.out.println("4WD");
        System.out.println(NumberFormat.getCurrencyInstance().format(getRetailPrice()).replaceAll("\\.00", "")
                + "\n" + getMPG() + "MPG");
    }
}
