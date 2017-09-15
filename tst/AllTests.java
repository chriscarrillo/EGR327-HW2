import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    VehicleTests.class,
    CarTests.class,
    TruckTests.class,
    InventoryTests.class
})
public class AllTests {
}
