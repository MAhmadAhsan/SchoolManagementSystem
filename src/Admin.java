public class Admin extends Person {
    private Credentials credentials;

    // Constructor
    public Admin(PersonalInfo personalInfo, ContactInfo contactInfo, Credentials Credentials) {
        super(personalInfo, contactInfo);
        setCredentials(Credentials);
    }

    // Getters
    public Credentials getCredentials() {
        return credentials;
    }

    //Setters
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\n" + getCredentials();
    }
}
