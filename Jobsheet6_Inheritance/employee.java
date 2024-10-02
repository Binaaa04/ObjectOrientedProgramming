/**
 * employee
 */
public class employee {
    public String nip;
    public String name;
    public double salary;

    public employee() {
        System.out.println("Object from employee");
    }

    public String getlnfo() {
        String info = "";
        info += "NIP        : " + nip + "\n";
        info += "Name       : " + name + "\n";
        info += "Salary     : " + salary + "\n";
        return info;
    }
}
