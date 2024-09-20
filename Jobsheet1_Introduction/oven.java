/**
 * oven
 */
public class oven {
    public String brand;
    public int temperature;
    public boolean power;

    public void turnOn() {
        power = true;
        System.out.println(brand + " oven is now ON.");
    }

    public void turnOff() {
        power = false;
        System.out.println(brand + " oven is now OFF.");
    }

    public void setTemperature(int temp) {
        if (power == true) {
            temperature = temp;
            System.out.println("Temperature set to " + temperature + " degrees.");
        } else {
            System.out.println("Oven is OFF. Please turn it ON first.");
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Current Temperature: " + temperature);
        System.out.println("Oven Status: " + (power ? "ON" : "OFF"));
    }
}
