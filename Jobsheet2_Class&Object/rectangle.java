/**
 * rectangle
 */
public class rectangle {

    public int panjang, wide;

    public void displayInfo() {
        System.out.println("Long : " + panjang);
        System.out.println("Wide : " + wide);
        System.out.println("Area : " + getArea());
        System.out.println("Circumference : " + getCircumference());

    }

    public int getArea() {
        return panjang * wide;
    }

    public int getCircumference() {
        return 2 * (panjang + wide);
    }
}