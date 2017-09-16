import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TruckTests {
    // Trucks used for testing
    private Truck t1 = new Truck("Chevrolet", "Silverado 1500", 2017, 27785, 24, true, true, 9400);
    private Truck t2 = new Truck("Dodge", "RAM 2500", 2018, 32000, 30, true, false, 10000);
    private Truck t3 = new Truck("Dodge", "RAM 1500", 2016, 25000, 22, true, true, 11000);

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
        Assert.assertEquals(Truck.class, t1.getClass());
        Assert.assertTrue(t2.getClass() == Truck.class);
        Assert.assertFalse(t3.getClass() != Truck.class);
    }

    @Test
    public void hasStepSideTest() {
        Assert.assertEquals("Incorrect value", true, t1.hasStepSide());
        Assert.assertTrue("Incorrect value", !t2.hasStepSide());
        Assert.assertFalse("Incorrect value", !t3.hasStepSide());
    }

    @Test
    public void setHasStepSideTest() {
        // When
        t1.setHasStepSide(false);
        t2.setHasStepSide(true);
        t3.setHasStepSide(false);

        // Then
        Assert.assertEquals("Incorrect value", false, t1.hasStepSide());
        Assert.assertTrue("Incorrect value", t2.hasStepSide());
        Assert.assertFalse("Incorrect value", t3.hasStepSide());
    }

    @Test
    public void setTowCapacityTest() {
        // When
        t1.setTowCapacity(10000);
        t2.setTowCapacity(10000);
        t3.setTowCapacity(10000);

        // Then
        Assert.assertEquals("Incorrect value", 10000, t1.getTowCapacity());
        Assert.assertFalse("Incorrect value", t2.getTowCapacity() == 11000);
        Assert.assertTrue("Incorrect value", t3.getTowCapacity() == 10000);
    }

    @Test
    public void getTowCapacityTest() {
        Assert.assertEquals("Incorrect tow capacity", 9400, t1.getTowCapacity());
        Assert.assertTrue("Incorrect tow capacity", t2.getTowCapacity() == 10000);
        Assert.assertFalse("Incorrect tow capacity", t3.getTowCapacity() != 11000);
    }

    @Test
    public void printVehicleTest() {
        // Set Streams
        setStreams();

        // When
        t1.printVehicle();

        // Then
        Assert.assertEquals("2017 Chevrolet Silverado 1500\n4WD\n$27,785\n24MPG\nHas Side Step\nTow up to 4.7 tons\n", output.toString());

        // Reset Streams
        resetStreams();
    }
}
