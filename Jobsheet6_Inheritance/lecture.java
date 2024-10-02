public class lecture extends employee {
    public String nidn;

    public lecture() {
        System.out.println("Object from lecture class");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP        : " + this.nip + "\n";
        info += "NIDN       : " + this.nidn + "\n";
        info += "Name       : " + this.name + "\n";
        info += "Salary     : " + this.salary + "\n";
        return info;
    }
}
