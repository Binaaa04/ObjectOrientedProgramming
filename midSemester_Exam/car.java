public class car extends vehicle {
    public double baggage;
    private String productionNumber;

    public car() {

    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    public car(String brand, String model, double baggage, String productionNumber) {
        super(brand, model);
        this.baggage = baggage;
        this.productionNumber = productionNumber;
    }

    public String displayInfo() {
        String info = super.displayInfo();
        System.out.println("Baggage Capacity: " + baggage + "kg");
        System.out.println("Production Number: " + productionNumber);
        return info;
    }
}
