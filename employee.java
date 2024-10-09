/**
 * employee
 */
public class employee {

    private String name;
    private String nip;
    private String category;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;

        switch (category.charAt(0)) {
            case '1':
                this.salary = 5000000;
                break;
            case '2':
                this.salary = 3000000;
                break;
            case '3':
                this.salary = 2000000;
                break;
            case '4':
                this.salary = 1000000;
                break;
            case '5':
                this.salary = 750000;
                break;

        }
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNIP() {
        return nip;
    }

    public String getCategory() {
        return category;
    }

    public double getSalary() {
        return salary;
    }
}