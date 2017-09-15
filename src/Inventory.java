import java.util.ArrayList;

public class Inventory extends ArrayList {
    private ArrayList<Vehicle> inventory;
    private int size;

    public Inventory() {
        inventory = new ArrayList<>();
        size = 0;
    }

    public void add(Vehicle v) {
        inventory.add(v);
        size += 1;
    }

    public void remove(Vehicle v) {
        inventory.remove(v);
        size -= 1;
    }

    public int size() {
        return size;
    }

    public Vehicle get(int index) {
        return inventory.get(index);
    }

    public Vehicle findCheapestVehicle() {
        Vehicle cheapest = inventory.get(0);

        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getRetailPrice() < cheapest.getRetailPrice())
                cheapest = inventory.get(i);
        }

        return cheapest;
    }

    public Vehicle findMostExpensiveVehicle() {
        Vehicle expensive = inventory.get(0);

        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getRetailPrice() > expensive.getRetailPrice())
                expensive = inventory.get(i);
        }

        return expensive;
    }

    public void printAveragePriceOfAllVehicles() {
        int sum = 0;

        for (int i = 0; i < inventory.size(); i++) {
            sum += inventory.get(i).getRetailPrice();
        }

        System.out.println(sum / inventory.size());
    }
}
