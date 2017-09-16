public class Main {
    public static void main(String[] args) {
        // Creates an ArrayList of Vehicle
        //ArrayList<Vehicle> vehicles = new ArrayList<>();
        Inventory vehicles = new Inventory();

        // Vehicles to be added to vehicles
        Car honda = new Car("Honda", "Accord", 2017, 22455, 36, true, false);
        Car toyota = new Car("Toyota", "Corolla", 2016, 18500, 30, true, false);
        Truck ford = new Truck("Ford", "F-150", 2015, 35000, 17, true, false, 10500);
        Truck chevy = new Truck("Chevrolet", "Silverado 1500", 2017, 27785, 24, true, true, 9400);

        // Add the vehicles to vehicles ArrayList
        vehicles.add(honda);
        vehicles.add(toyota);
        vehicles.add(ford);
        vehicles.add(chevy);

        // Print out each vehicle from vehicles
        for (int i = 0; i < vehicles.getSize(); i++) {
            vehicles.get(i).printVehicle();
            System.out.println();
        }

        /*vehicles.findCheapestVehicle().printVehicle();
        System.out.println();
        vehicles.findMostExpensiveVehicle().printVehicle();
        System.out.println();
        vehicles.printAveragePriceOfAllVehicles();*/
    }
}
