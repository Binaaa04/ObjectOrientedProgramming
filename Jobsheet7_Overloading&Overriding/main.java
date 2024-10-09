public class main {
    public static void main(String[] args) {
        System.out.println("Testing program class manager & staff");
        manager man[] = new manager[2];
        staff staff1[] = new staff[2];
        staff staff2[] = new staff[3];

        man[0] = new manager();
        man[0].setName("Tedjo");
        man[0].setNIP("101");
        man[0].setCategory("1");
        man[0].setSubsidy(5000000);
        man[0].setSection("administration");

        man[1] = new manager();
        man[1].setName("Atika");
        man[1].setNIP("102");
        man[1].setCategory("1");
        man[1].setSubsidy(2500000);
        man[1].setSection("marketing");

        staff1[0] = new staff();
        staff1[0].setName("Usman");
        staff1[0].setNIP("0003");
        staff1[0].setCategory("2");
        staff1[0].setOvertime(10);
        staff1[0].setOvertimeSalary(10000);

        staff1[1] = new staff();
        staff1[1].setName("Augrah");
        staff1[1].setNIP("0005");
        staff1[1].setCategory("2");
        staff1[1].setOvertime(10);
        staff1[1].setOvertimeSalary(55000);
        man[0].setStaff(staff1);

        staff2[0] = new staff();
        staff2[0].setName("Hendra");
        staff2[0].setNIP("0004");
        staff2[0].setCategory("3");
        staff2[0].setOvertime(15);
        staff2[0].setOvertimeSalary(5500);

        staff2[1] = new staff();
        staff2[1].setName("Arie");
        staff2[1].setNIP("0006");
        staff2[1].setCategory("4");
        staff2[1].setOvertime(5);
        staff2[1].setOvertimeSalary(100000);

        staff2[2] = new staff();
        staff2[2].setName("Mentari");
        staff2[2].setNIP("0007");
        staff2[2].setCategory("3");
        staff2[2].setOvertime(6);
        staff2[2].setOvertimeSalary(20000);
        man[1].setStaff(staff2);

        man[0].infoDisplay();
        man[1].infoDisplay();
    }
}
