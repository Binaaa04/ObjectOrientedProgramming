package JS08Interface;

public class fan extends electronicTools {
    private String type;

    public fan(String type, double price, String color, String merk) {
        super(price, color, merk);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Type: " + type;
    }
}

