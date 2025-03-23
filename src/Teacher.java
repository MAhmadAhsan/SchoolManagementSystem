public class Teacher {
    private PersonalInfo personalInfo;
    private ContactInfo contactInfo;
    Credentials Credentials;
    // Constructor
    public Teacher(PersonalInfo personalInfo, ContactInfo contactInfo, Credentials Credentials) {
        this.personalInfo = personalInfo;
        this.contactInfo = contactInfo;
        this.Credentials = Credentials;
    }

    // Getters
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public Credentials getCredentials() {
        return Credentials;
    }
    //Setters
    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }
}
