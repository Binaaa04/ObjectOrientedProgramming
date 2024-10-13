public class mainUserProfile {
    public static void main(String[] args) {
        customer cs1 = new customer(104, "kiyowo12", "Lee Jeno", 25, "jenolee@gmail.com");
        cs1.logIn(104, "kiyowo12");
        cs1.applyVerification("document.pdf");
        System.out.println("Customer verification status: " + cs1.getVerificationStatus());

        admin admin1 = new admin(212, "apayah", "Timothee Chalamet", 30, "timothee@gmail.com");
        admin1.logIn(212, "apayah");
        admin1.addVehicle();
        admin1.verifyUser();
    }
}
