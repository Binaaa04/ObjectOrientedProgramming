/**
 * vehicle
 */
public class vehicle {
    public String brand;
    public String model;

    public vehicle() {

    }

    public vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String displayInfo() {
        String info = "";
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        return info;
    }
}