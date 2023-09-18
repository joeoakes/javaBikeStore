public class Main {
    public static void main(String[] args) {
        BikeStoreInventory inventory = new BikeStoreInventory();

        // Add some bikes to the inventory
        inventory.addBike(new Bike(1, "Trek", "FX 2", 499.99));
        inventory.addBike(new Bike(2, "Giant", "Escape 3", 399.99));
        inventory.addBike(new Bike(3, "Specialized", "Sirrus 2.0", 549.99));

        // List all bikes in the inventory
        inventory.listAllBikes();

        // Search for a bike by ID
        int searchId = 2;
        Bike foundBike = inventory.findBikeById(searchId);
        if (foundBike != null) {
            System.out.println("Found bike with ID " + searchId + ": " + foundBike.getBrand() + " " + foundBike.getModel());
        } else {
            System.out.println("Bike with ID " + searchId + " not found.");
        }

        // Remove a bike from the inventory
        int removeId = 1;
        inventory.removeBike(removeId);
        System.out.println("Removed bike with ID " + removeId + ".");

        // List all bikes in the inventory after removal
        inventory.listAllBikes();
    }
}