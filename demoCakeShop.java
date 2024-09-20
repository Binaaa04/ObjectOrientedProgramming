public class demoCakeShop {
    public static void main(String[] args) {
        customer customerData = new customer("Sabrina", "0201");

        transaction transactionCustomer = new transaction(customerData);

        cake cake1 = new cake("Cheesecake", 30000, "Cake");
        cake cake2 = new cake("Chocolate Pistachio Crossaint", 35000, "Pastry");

        transactionCustomer.cakeOrder(cake1);
        transactionCustomer.cakeOrder(cake2);

        transactionCustomer.getInfo();
    }
}
