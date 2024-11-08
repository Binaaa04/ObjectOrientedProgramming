package JS08Interface;

public class electronicTools {
    private double price;
    private String color;
    private String merk;
    
    public electronicTools(double price, String color, String merk) {
        this.price = price;
        this.color = color;
        this.merk = merk;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String Color) {
        this.color = Color;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getInfo() {
        return "Merk: " + merk + ", Color: " + color + ", Price: " + price;
    }
}
