import java.util.ArrayList;
import java.util.List;

// Define a class to represent the Bike Store Inventory
class BikeStoreInventory {
    //ArrayList<generic> 
    private List<Bike> bikes;

    //Constructor Method creates the bike instance bikes object
    public BikeStoreInventory() {
        bikes = new ArrayList<>();
    }

    // Add a bike to the inventory
    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    // Remove a bike from the inventory
    public void removeBike(int bikeId) {
        bikes.removeIf(bike -> bike.getId() == bikeId);
    }

    // Search for a bike by ID
    public Bike findBikeById(int bikeId) {
        for (Bike bike : bikes) {
            if (bike.getId() == bikeId) {
                return bike;
            }
        }
        return null; // Bike not found
    }

    // List all bikes in the inventory
    public void listAllBikes() {
        System.out.println("Bike Inventory:");
        for (Bike bike : bikes) {
            System.out.println("ID: " + bike.getId() + ", Brand: " + bike.getBrand() +
                    ", Model: " + bike.getModel() + ", Price: $" + bike.getPrice());
        }
    }
}
