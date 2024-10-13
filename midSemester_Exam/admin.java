public class admin extends user {
    public admin(int user_id, String password, String name, int age, String email) {
        super(user_id, password, name, age, email);
    }

    public void updateVehicleDetails(int vehicle_id) {
        System.out.println("Vehicle " + vehicle_id + " details updated.");
    }

    public void addVehicle() {
        System.out.println("New vehicle added.");
    }

    public void retrieveComplain() {
        System.out.println("Complain retrieved.");
    }

    public void verifyUser() {
        System.out.println("User verified.");
    }
}
