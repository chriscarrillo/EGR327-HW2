import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class VehicleTests {
    // 3 Vehicles used for testing
    private Vehicle v1 = new Vehicle("Honda", "Accord", 2017, 18000, 30, true);
    private Vehicle v2 = new Vehicle("Toyota", "Corolla", 2016, 21500, 32, true);
    private Vehicle v3 = new Vehicle("Kia", "Spectra", 2018, 24220, 35, true);

    // Streams used for testing
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errors = new ByteArrayOutputStream();

    /**
     * Helper method that sets up the streams for testing
     */
    private void setStreams() {
        System.setOut(new PrintStream(output));
        System.setErr(new PrintStream(errors));
    }

    /**
     * Helper method that resets the streams
     */
    private void resetStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void constructorTest() {
        Assert.assertEquals(Vehicle.class, v1.getClass());
        Assert.assertFalse(v2.getClass() != Vehicle.class);
        Assert.assertTrue(v3.getClass() == Vehicle.class);
    }

    @Test
    public void getMakeTest() {
        Assert.assertEquals("Incorrect make", "Honda", v1.getMake());
        Assert.assertTrue("Incorrect make", v2.getMake().equals("Toyota"));
        Assert.assertFalse("Incorrect make", v3.getMake().equals("Honda"));
    }

    @Test
    public void getModelTest() {
        Assert.assertEquals("Incorrect model", "Accord", v1.getModel());
        Assert.assertFalse("Incorrect model", v2.getModel().equals("Spectra"));
        Assert.assertTrue("Incorrect model", v3.getModel().equals("Spectra"));
    }

    @Test
    public void getModelYearTest() {
        Assert.assertEquals("Incorrect model year", 2017, v1.getModelYear());
        Assert.assertTrue("Incorrect model year", v2.getModelYear() == 2016);
        Assert.assertFalse("Incorrect model year", v3.getModelYear() == 2016);
    }

    @Test
    public void getRetailPriceTest() {
        Assert.assertEquals("Incorrect retail price", 18000, v1.getRetailPrice());
        Assert.assertTrue("Incorrect retail price", v2.getRetailPrice() == 21500);
        Assert.assertFalse("Incorrect retail price", v3.getRetailPrice() == 2016);
    }

    @Test
    public void getMPGTest() {
        Assert.assertEquals("Incorrect MPG", 30, v1.getMPG());
        Assert.assertFalse("Incorrect MPG", v2.getMPG() == 31);
        Assert.assertTrue("Incorrect MPG", v3.getMPG() == 35);
    }

    @Test
    public void isFourWDTest() {
        Assert.assertEquals("Incorrect value", true, v1.isFourWD());
        Assert.assertTrue("Incorrect value", v2.isFourWD());
        Assert.assertFalse("Incorrect value", !v3.isFourWD());
    }

    @Test
    public void setMakeTest() {
        // When
        v1.setMake("Toyota");
        v2.setMake("Honda");
        v3.setMake("Kia");

        // Then
        Assert.assertEquals("Incorrect make", "Toyota", v1.getMake());
        Assert.assertEquals("Incorrect make", "Honda", v2.getMake());
        Assert.assertEquals("Incorrect make", "Kia", v3.getMake());
    }

    @Test
    public void setModelTest() {
        // When
        v1.setModel("Corolla");
        v2.setModel("Accord");
        v3.setModel("Spectra");

        // Then
        Assert.assertEquals("Incorrect model", "Corolla", v1.getModel());
        Assert.assertEquals("Incorrect model", "Accord", v2.getModel());
        Assert.assertEquals("Incorrect model", "Spectra", v3.getModel());
    }

    @Test
    public void setModelYearTest() {
        // When
        v1.setModelYear(2018);
        v2.setModelYear(2020);
        v3.setModelYear(2000);

        // Then
        Assert.assertEquals("Incorrect model year", 2018, v1.getModelYear());
        Assert.assertEquals("Incorrect model year", 2020, v2.getModelYear());
        Assert.assertEquals("Incorrect model year", 2000, v3.getModelYear());
    }

    @Test
    public void setRetailPriceTest() {
        // When
        v1.setRetailPrice(20000);
        v2.setRetailPrice(32000);
        v3.setRetailPrice(50000);

        // Then
        Assert.assertEquals("Incorrect retail price", 20000, v1.getRetailPrice());
        Assert.assertEquals("Incorrect retail price", 32000, v2.getRetailPrice());
        Assert.assertEquals("Incorrect retail price", 50000, v3.getRetailPrice());
    }

    @Test
    public void setMPGTest() {
        // When
        v1.setMPG(35);
        v2.setMPG(100);
        v3.setMPG(40);

        // Then
        Assert.assertEquals("Incorrect MPG", 35, v1.getMPG());
        Assert.assertEquals("Incorrect MPG", 100, v2.getMPG());
        Assert.assertEquals("Incorrect MPG", 40, v3.getMPG());
    }

    @Test
    public void setFourWDTest() {
        // When
        v1.setFourWD(false);
        v2.setFourWD(false);
        v3.setFourWD(false);

        // Then
        Assert.assertEquals("Incorrect value", false, v1.isFourWD());
        Assert.assertEquals("Incorrect value", false, v2.isFourWD());
        Assert.assertEquals("Incorrect value", false, v3.isFourWD());
    }

    @Test
    public void printVehicleTest() {
        // Set Streams
        setStreams();

        // When
        v1.printVehicle();

        // Then
        Assert.assertEquals("2017 Honda Accord\n4WD\n$18,000\n30MPG\n", output.toString());

        // Reset Streams
        resetStreams();
    }
}
