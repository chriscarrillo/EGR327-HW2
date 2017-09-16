import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CarTests {
    // Cars used for testing
    private Car c1 = new Car("Dodge", "Charger", 2016, 30000, 34, true, false);
    private Car c2 = new Car("Dodge", "Mustang", 2019, 45000, 40, true, true);
    private Car c3 = new Car("Buick", "Sabre", 2015, 36500, 30, true, false);

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
        Assert.assertEquals(Car.class, c1.getClass());
        Assert.assertTrue(c2.getClass() == Car.class);
        Assert.assertFalse(c3.getClass() != Car.class);
    }

    @Test
    public void isConvertibleTest() {
        // Then
        Assert.assertEquals("Incorrect value", false, c1.isConvertible());
        Assert.assertTrue("Incorrect value", c2.isConvertible());
        Assert.assertFalse("Incorrect value", c3.isConvertible());
    }

    @Test
    public void setConvertibleTest() {
        // When
        c1.setConvertible(true);
        c2.setConvertible(false);
        c3.setConvertible(true);

        // Then
        Assert.assertEquals("Incorrect value", true, c1.isConvertible());
        Assert.assertTrue("Incorrect value", !c2.isConvertible());
        Assert.assertFalse("Incorrect value", !c3.isConvertible());
    }

    @Test
    public void printVehicleTest() {
        // Set Streams
        setStreams();

        // When
        c1.printVehicle();

        // Then
        Assert.assertEquals("2016 Dodge Charger\n4WD\n$30,000\n34MPG\nNot A Convertible\n", output.toString());

        // Reset Streams
        resetStreams();
    }
}
