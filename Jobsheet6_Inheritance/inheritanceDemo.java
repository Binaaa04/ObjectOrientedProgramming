public class inheritanceDemo {
    public static void main(String[] args) {
        lecture lecture1 = new lecture();
        lecture1.name = "Yansy Ayuningtyas";
        lecture1.nip = "34329837";
        lecture1.salary = 3000000;
        lecture1.nidn = "1989432439";
        System.out.println(lecture1.getAllInfo());

        lecture lecture2 = new lecture("34329837", "Yansy Ayuningtyas", 3000000, "1989432439");
        System.out.println(lecture2.getAllInfo());

    }
}
