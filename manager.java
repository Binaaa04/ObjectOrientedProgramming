public class manager extends employee {
    private double subsidy;
    private String section;
    private staff st[];

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setStaff(staff st[]) {
        this.st = st;
    }

    public void viewStaff() {
        int i;
        System.out.println("----------------------------");
        for (i = 0; i < st.length; i++) {
            st[i].infoDisplay();
        }
        System.out.println("----------------------------");
    }

    public void infoDisplay() {
        System.out.println("");
        System.out.println("Manager : " + this.getSection());
        System.out.println("NIP : " + this.getNIP());
        System.out.println("Name : " + this.getName());
        System.out.println("Category : " + this.getCategory());
        System.out.println("Section : " + this.getSection());
        System.out.printf("Subsidy : %.0f\n", this.getSubsidy());
        System.out.printf("Salary :%.0f\n", this.getSalary());
        this.viewStaff();
    }

    // Overriding
    public double getSalary() {
        return super.getSalary() + subsidy;
    }
}
