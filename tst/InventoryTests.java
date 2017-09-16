import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InventoryTests {
    // Inventory used for testing
    private Inventory inv = new Inventory();

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

    private void buildInventory() {
        // Given
        Vehicle v1 = new Vehicle("Honda", "Accord", 2017, 20000, 30, true);
        Vehicle v2 = new Vehicle("Toyota", "Corolla", 2015, 18000, 28, true);
        Vehicle v3 = new Vehicle("Mitsubishi", "Lancer", 2016, 30000, 35, true);
        Vehicle v4 = new Vehicle("Dodge", "Charger", 2014, 35000, 20, false);
        Vehicle v5 = new Vehicle("Ford", "Mustang", 2018, 40000, 32, false);

        // When
        inv.add(v1);
        inv.add(v2);
        inv.add(v3);
        inv.add(v4);
        inv.add(v5);
    }

    @Test
    public void constructorTest() {
        Assert.assertEquals(inv.getClass(), Inventory.class);
    }

    @Test
    public void addTest() {
        // Given
        Vehicle v = new Vehicle();

        // When
        inv.add(v);

        // Then
        Assert.assertEquals("The vehicle was not successfully added.", 1, inv.getSize());
    }

    @Test
    public void removeTest() {
        // Given
        Vehicle v = new Vehicle();

        // When
        inv.add(v);
        inv.remove(v);

        // Then
        Assert.assertEquals("The vehicle was not removed.", 0, inv.getSize());
    }

    @Test
    public void findCheapestVehicleTest() {
        // Given & When
        buildInventory();

        // Then
        Assert.assertEquals(inv.get(1), inv.findCheapestVehicle());
    }

    @Test
    public void findMostExpensiveVehicleTest() {
        // Given & When
        buildInventory();

        // Then
        Assert.assertEquals(inv.get(4), inv.findMostExpensiveVehicle());
    }

    @Test
    public void printAveragePriceOfAllVehiclesTest() {
        // Set Streams
        setStreams();

        // Given
        buildInventory();

        // When
        inv.printAveragePriceOfAllVehicles();

        // Then
        Assert.assertEquals("28600\n", output.toString());

        // Reset Streams
        resetStreams();
    }
}
