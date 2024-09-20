/**
 * studentDemo
 */
public class studentDemo {

    public static void main(String[] args) {
        student m1 = new student();
        m1.nim = "023432";
        m1.name = "Yansy Ayuningtyas";
        m1.address = "Nias, Sumatra Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        System.out.println();
        student m2 = new student();
        m2.nim = "02434";
        m2.name = "Sabrina Rahmadini";
        m2.address = "Jakarta";
        m2.kelas = "2G";
        m2.displayBiodata();
    }
}