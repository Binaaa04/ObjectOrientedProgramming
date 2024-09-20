import java.util.ArrayList;

public class transaction {
    private customer customerData;
    private ArrayList<cake> cakeListOrder;
    private double priceTotal;
    private double discount;

    public transaction(customer customerData) {
        this.customerData = customerData;
        this.cakeListOrder = new ArrayList<cake>();
        this.priceTotal = 0.0;
        this.discount = 0.0;
    }

    public void cakeOrder(cake cake) {
        cakeListOrder.add(cake);
        priceTotal += cake.getPrice();

        if (cakeListOrder.size() >= 2) {
            discount = priceTotal * 0.10; // get a discount 10% if order a cake more than 2
        } else {
            discount = 0;
        }
    }

    public void getInfo() {
        System.out.println("Customer name : " + customerData.getName());
        System.out.println("Order number  : " + customerData.getorderNumber());
        System.out.println();
        System.out.println("list of cakes to buy:");
        for (cake cake : cakeListOrder) {
            System.out.println("\t- " + cake.getName() + " \t Price : " + cake.getPrice());
        }
        System.out.println();
        System.out.println("Total price : " + priceTotal);
        System.out.println("Discount : " + discount);
        System.out.println("Final price: " + (priceTotal - discount));
    }
}
