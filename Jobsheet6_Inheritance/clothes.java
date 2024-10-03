/**
 * clothes
 */
public class clothes {

    String color;
    String size;
    String material;

    public clothes() {
    }

    public clothes(String color, String size, String material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    public String getInfo() {
        String info = "";
        info += "Color        : " + color + "\n";
        info += "Size         : " + size + "\n";
        info += "Material     : " + material + "\n";
        return info;
    }
}
