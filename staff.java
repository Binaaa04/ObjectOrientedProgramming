public class staff extends employee {
    private int overtime;
    private double overtimeSalary;

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertimeSalary(double overtimeSalary) {
        this.overtimeSalary = overtimeSalary;
    }

    public double getOvertimeSalary() {
        return overtimeSalary;
    }

    // Overloading
    public double getSalary(int overtime, double overtimeSalary) {
        return super.getSalary() + overtime * overtimeSalary;
    }

    // Overriding
    public double getSalary() {
        return super.getSalary() + overtime * overtimeSalary;
    }

    public void infoDisplay() {
        System.out.println("");
        System.out.println("NIP : " + this.getNIP());
        System.out.println("Name : " + this.getName());
        System.out.println("Category : " + this.getCategory());
        System.out.println("Total Overtime : " + this.getOvertime());
        System.out.printf("Overtime Salary :%.0f\n ", this.getOvertimeSalary());
        System.out.printf("Salary :%.0f\n", this.getSalary());
    }
}
