package JS08Interface;

public class fridge extends electronicTools {
    private int doorCount;

    public fridge(int doorCount, double price, String color, String merk) {
        super(price, color, merk);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Jumlah Pintu: " + doorCount;
    }
}

