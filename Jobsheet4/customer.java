public class customer {
    private String name;
    private String orderNumber;

    public customer(String name, String orderNumber) {
        this.name = name;
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getorderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getInfo() {
        String info = "";
        info += "Name : " + this.name + "\n";
        info += "Order Number : " + this.orderNumber + "\n";
        info += "\n";
        return info;
    }
}
