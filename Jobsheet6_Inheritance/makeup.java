public class makeup {
    private String productID;
    public String brand;
    public String type;
    public double price;

    public makeup() {

    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public makeup(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String getInfo() {
        String info = "";
        info += "Brand        : " + brand + "\n";
        info += "Type         : " + type + "\n";
        info += "Price        : " + price + "\n";
        info += "Product ID   : " + productID + "\n";
        return info;
    }
}
