public class lecture extends employee {
    public String nidn;

    public lecture() {
        // System.out.println("Object from lecture class");
    }

    public lecture(String nip, String name, double salary, String nidn) {
        this.nidn = nidn;
        super(nip, name, salary);
    }

    public String getAllInfo() {
        String info = getlnfo();
        info += "NIDN       : " + nidn + "\n";
        return info;
    }
}
