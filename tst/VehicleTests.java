import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class VehicleTests {
    private Vehicle v = new Vehicle("Honda", "Accord", 2017, 18000, 30, true);
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void constructorTest() {

    }

    @Test
    public void getMakeTest() {
        Assert.assertEquals("Incorrect make", "Honda", v.getMake());
    }

    @Test
    public void getModelTest() {
        Assert.assertEquals("Incorrect model", "Accord", v.getModel());
    }

    @Test
    public void getModelYearTest() {
        Assert.assertEquals("Incorrect model year", 2017, v.getModelYear());
    }

    @Test
    public void getRetailPriceTest() {
        Assert.assertEquals("Incorrect retail price", 18000, v.getRetailPrice());
    }

    @Test
    public void getMPGTest() {
        Assert.assertEquals("Incorrect MPG", 30, v.getMPG());
    }

    @Test
    public void isFourWDTest() {
        Assert.assertEquals("Incorrect value", true, v.isFourWD());
    }

    @Test
    public void setMakeTest() {
        // When
        v.setMake("Toyota");

        // Then
        Assert.assertEquals("Incorrect make", "Toyota", v.getMake());
    }

    @Test
    public void setModelTest() {
        // When
        v.setModel("Corolla");

        // Then
        Assert.assertEquals("Incorrect model", "Corolla", v.getModel());
    }

    @Test
    public void setModelYearTest() {
        // When
        v.setModelYear(2018);

        // Then
        Assert.assertEquals("Incorrect model year", 2018, v.getModelYear());
    }

    @Test
    public void setRetailPriceTest() {
        // When
        v.setRetailPrice(20000);

        // Then
        Assert.assertEquals("Incorrect retail price", 20000, v.getRetailPrice());
    }

    @Test
    public void setMPGTest() {
        // When
        v.setMPG(35);

        // Then
        Assert.assertEquals("Incorrect MPG", 35, v.getMPG());
    }

    @Test
    public void setFourWDTest() {
        // When
        v.setFourWD(false);

        // Then
        Assert.assertEquals("Incorrect value", false, v.isFourWD());
    }

    @Test
    public void printVehicleTest() {
        System.setOut(new PrintStream(output));
        v.printVehicle();
        Assert.assertEquals("2017 Honda Accord\n4WD\n$18,000\n30MPG\n", output.toString());
    }
}
