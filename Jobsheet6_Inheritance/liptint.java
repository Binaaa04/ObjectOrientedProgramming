public class liptint extends makeup {
    public String colorNumber;

    public liptint() {

    }

    public liptint(String colorNumber, String brand, String type, double price) {
        super(brand, type, price);
        this.colorNumber = colorNumber;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "Color Number: " + this.colorNumber + "\n";
        return info;
    }
}
