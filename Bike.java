// Define a class to represent a Bike
class Bike {

    //Data Members, Characteristics of a Bike, Class Level Variables
    private int id;
    private String brand;
    private String model;
    private double price;

    //Constructor Method
    public Bike(int id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Setters and Getter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
