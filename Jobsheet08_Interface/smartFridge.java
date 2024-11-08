package JS08Interface;

public class smartFridge extends fridge implements Audible {
    private int volume;

    public smartFridge(int volume, int doorCount, double price, String color, String merk) {
        super(doorCount, price, color, merk);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void increaseVolume(int increment) {
        volume += increment;  
    }

    @Override
    public void decreaseVolume(int decrement) {
        volume -= decrement; 
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Volume: " + volume;
    }
}
