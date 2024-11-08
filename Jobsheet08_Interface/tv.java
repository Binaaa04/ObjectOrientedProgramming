package JS08Interface;

public class tv extends electronicTools implements Audible {
    private String screenType;
    private int volume;

    public tv(String screenType, int volume, double price, String color, String merk) {
        super(price, color, merk);
        this.screenType = screenType;
        this.volume = volume;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
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
        return super.getInfo() + ", Tipe Layar: " + screenType + ", Volume: " + volume;
    }
}

