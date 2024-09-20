/**
 * item
 */
public class item {
    public String code, name;
    public double grossPrice, discount;

    public double getNetPrice() {
        return grossPrice - discount * grossPrice;
    }

    public void displayInfo() {
        System.out.println("Code :" + code);
        System.out.println("Name :" + name);
        System.out.println("Gross Price :" + grossPrice);
        System.out.println("Discount :" + discount);
        System.out.println("Net Price :" + getNetPrice());
    }
}
