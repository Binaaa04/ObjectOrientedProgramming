public class userProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email;
    private String doc;

    public userProfile() {
    }

    public userProfile(int user_id, String password, String name, int age, String email) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getUserId() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void editProfile(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        System.out.println("Profile updated.");
    }

    public void showDocuments() {
        System.out.println("Documents: " + doc);
    }
}
