public class clothesDemo {
    public static void main(String[] args) {
        shirt shirtDesc = new shirt();
        System.out.println(shirtDesc.getInfo());

        shirt shirtDesc2 = new shirt("Blue", "M", "Cotton", "Striped");
        System.out.println(shirtDesc2.getInfo());
    }
}
