package Jobsheet3;

public class user {
    public String username;
    public String name;
    public String email;
    public String address;
    public String job;

    public user(String username, String name, String email) {
        this.username = username;
        this.name = name;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Username : " + username);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Address : " + address);
        System.out.println("Job : " + job);
        System.out.println("==================================");
    }
}
