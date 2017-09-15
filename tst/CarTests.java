import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CarTests {
    private Car c1 = new Car("Dodge", "Charger", 2016, 30000, 34, true, false);
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void constructorTest() {

    }

    @Test
    public void isConvertibleTest() {
        // Then
        Assert.assertEquals("Incorrect value", false, c1.isConvertible());
    }

    @Test
    public void setConvertibleTest() {
        // When
        c1.setConvertible(true);

        // Then
        Assert.assertEquals("Incorrect value", true, c1.isConvertible());
    }

    @Test
    public void printVehicleTest() {
        System.setOut(new PrintStream(output));
        c1.printVehicle();
        Assert.assertEquals("2016 Dodge Charger\n4WD\n$30,000\n34MPG\nNot A Convertible\n", output.toString());
    }
}
