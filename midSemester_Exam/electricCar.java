public class electricCar extends car {
    public int batteryCapacity;

    public electricCar(String brand, String model, double baggage, String productionNumber, int batteryCapacity) {
        super(brand, model, baggage, productionNumber);
        this.batteryCapacity = batteryCapacity;
    }

    public String displayInfo() {
        String info = super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + "kWh");
        return info;
    }
}
