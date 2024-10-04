public class makeupDemo {
    public static void main(String[] args) {
        cushion cushionDesc = new cushion();
        cushionDesc.shade = "Warm Beige";
        cushionDesc.brand = "Mother of Pearl";
        cushionDesc.price = 209.000;
        cushionDesc.type = "Cushion";
        cushionDesc.setProductID("44540001");
        System.out.println(cushionDesc.getAllInfo());

        liptint liptintDesc = new liptint("PK02", "Makeover", "Liptint", 169.00);
        liptintDesc.setProductID("43252493");
        System.out.println(liptintDesc.getAllInfo());
    }
}
