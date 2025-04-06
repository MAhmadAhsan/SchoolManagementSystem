public class Credentials {
    private String password;
    private String username;

    // Constructor
    public Credentials(String password, String username) {
        this.setPassword(password);
        this.setUsername(username);
    }

    // Getters
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

    // Setters
    public void setPassword(String password) throws IllegalArgumentException {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }
    }
    public void setUsername(String username) {
        this.username = username;
    }

    // toString Method
    @Override
    public String toString() {
        return "Password: " + getPassword() + "\nUsername: " + getUsername();
    }
}
