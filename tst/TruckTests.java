import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TruckTests {
    private Truck t1 = new Truck("Chevrolet", "Silverado 1500", 2017, 27785, 24, true, true, 9400);
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void constructorTest() {

    }

    @Test
    public void hasStepSideTest() {
        Assert.assertEquals("Incorrect value", true, t1.hasStepSide());
    }

    @Test
    public void setHasStepSideTest() {
        // When
        t1.setHasStepSide(false);

        // Then
        Assert.assertEquals("Incorrect value", false, t1.hasStepSide());
    }

    @Test
    public void setTowCapacityTest() {
        // When
        t1.setTowCapacity(10000);

        // Then
        Assert.assertEquals("Incorrect value", 10000, t1.getTowCapacity());
    }

    @Test
    public void getTowCapacityTest() {
        Assert.assertEquals("Incorrect tow capacity", 9400, t1.getTowCapacity());
    }

    @Test
    public void printVehicleTest() {
        System.setOut(new PrintStream(output));
        t1.printVehicle();
        Assert.assertEquals("2017 Chevrolet Silverado 1500\n4WD\n$27,785\n24MPG\nHas Side Step\nTow up to 4.7 tons\n", output.toString());
    }
}
