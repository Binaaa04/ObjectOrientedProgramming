public class lecture extends employee {
    public String nidn;

    public lecture() {
        System.out.println("Object from lecture class");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP        : " + super.nip + "\n";
        info += "NIDN       : " + this.nidn + "\n";
        info += "Name       : " + super.name + "\n";
        info += "Salary     : " + super.salary + "\n";
        return info;
    }
}
