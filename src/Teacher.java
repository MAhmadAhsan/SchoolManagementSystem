public class Teacher {
    private PersonalInfo personalInfo;
    private ContactInfo contactInfo;
    private Credentials credentials;

    // Constructor
    public Teacher(PersonalInfo personalInfo, ContactInfo contactInfo, Credentials Credentials) {
        this.personalInfo = personalInfo;
        this.contactInfo = contactInfo;
        this.credentials = Credentials;
    }

    // Getters
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public Credentials getCredentials() {
        return credentials;
    }

    //Setters
    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void setCredentials(Credentials Credentials) {
        this.credentials = Credentials;
    }

    // toString
    @Override
    public String toString() {
        return personalInfo.toString() + "\n " + contactInfo.toString() + "\n" + credentials.toString();
    }
}
