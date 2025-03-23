public class Credentials {
    private String password;
    private String username;

    // Constructors
    public Credentials(String password, String username) {
        setPassword(password);
        setUsername(username);
    }

    // toString Method
    @Override
    public String toString() {
        return getPassword();
    }

    // Getter
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

    // Setter
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
