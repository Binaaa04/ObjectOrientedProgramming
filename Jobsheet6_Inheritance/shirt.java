public class shirt extends clothes {
    String pattern;

    public shirt() {
        super();
    }

    public shirt(String color, String size, String material, String pattern) {
        super(color, size, material);
        this.pattern = pattern;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Pattern     : " + this.pattern + "\n";
        return info;
    }
}
