public class lecture extends employee {
    public String nidn;

    public lecture() {
        System.out.println("Object from lecture class");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP        : " + nip + "\n";
        info += "NIDN       : " + nidn + "\n";
        info += "Name       : " + name + "\n";
        info += "Salary     : " + salary + "\n";
        return info;
    }
}
