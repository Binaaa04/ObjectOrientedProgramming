public class lecture extends employee {
    public String nidn;

    public lecture() {
        // System.out.println("Object from lecture class");
    }

    public lecture(String nip, String name, double salary, String nidn) {
        super(nip, name, salary);
        this.nidn = nidn;
    }

    public String getAllInfo() {
        String info = getlnfo();
        info += "NIDN       : " + nidn + "\n";
        return info;
    }
}
