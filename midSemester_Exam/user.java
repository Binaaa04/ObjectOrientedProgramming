public class user extends userProfile {
    public user() {

    }

    public user(int user_id, String password, String name, int age, String email) {
        super(user_id, password, name, age, email);
    }

    public void logIn(int user_id, String password) {
        if (getUserId() == user_id && getPassword().equals(password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }
    }

    public void recoverPassword() {
        System.out.println("Password recovery process initiated.");
    }

    public void logOut() {
        System.out.println("Logged out.");
    }
}
