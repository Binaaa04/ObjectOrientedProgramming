public class cushion extends makeup {
    public String shade;

    public cushion() {

    }

    public String getInfo() {
        return "shade : " + this.shade + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo() + "\n";
        return info;
    }
}
