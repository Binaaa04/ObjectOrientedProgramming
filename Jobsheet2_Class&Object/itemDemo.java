/**
 * itemDemo
 */
public class itemDemo {

    public static void main(String[] args) {
        item stuff = new item();
        stuff.code = "ATK01";
        stuff.name = "Black Pilot Pen";
        stuff.grossPrice = 3500;
        stuff.discount = 0.1;
        stuff.displayInfo();
    }
}