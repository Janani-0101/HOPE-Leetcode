public class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void display() {
        System.out.println("User: " + username);
    }
}
