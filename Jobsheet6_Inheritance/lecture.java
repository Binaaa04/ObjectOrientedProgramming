public class lecture extends employee {
    public String nidn;

    public lecture() {
        System.out.println("Object from lecture class");
    }

    public String getAllInfo() {
        String info = getlnfo();
        info += "NIDN       : " + nidn + "\n";
        return info;
    }
}
