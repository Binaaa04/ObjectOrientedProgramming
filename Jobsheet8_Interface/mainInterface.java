package JS08Interface;

public class mainInterface {
    public static void main(String[] args) {
        fan fan1 = new fan("Ceiling Fan", 250.0, "Putih", "Panasonic");
        fridge fridge1 = new fridge(2, 500.0, "Silver", "LG");
        smartFridge smartFridge1 = new smartFridge(20, 3, 1200.0, "Black", "Samsung");
        tv tv1 = new tv("LED", 10, 750.0, "Black", "Sony");

        System.out.println(" Fan: " + fan1.getInfo());
        System.out.println(" Fridge: " + fridge1.getInfo());
        System.out.println(" SmartFridge: " + smartFridge1.getInfo());
        System.out.println(" TV: " + tv1.getInfo());
    }
}


