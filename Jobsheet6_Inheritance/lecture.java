public class lecture extends employee {
    public String nidn;

    public lecture() {
        System.out.println("Object from lecture class");
    }

    public lecture(String nip, String name, double salary, String nidn) {
        System.out.println("objects of the lecturer class are created with parameterized constructors");
    }

    public String getAllInfo() {
        String info = super.getlnfo();
        info += "NIDN       : " + nidn + "\n";
        return info;
    }
}
