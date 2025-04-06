public class Admin {
    private PersonalInfo personalInfo;
    private ContactInfo contactInfo;
    private Credentials Credentials;

    // Constructor
    public Admin(PersonalInfo personalInfo, ContactInfo contactInfo, Credentials Credentials) {
        this.personalInfo = personalInfo;
        this.contactInfo = contactInfo;
        this.Credentials = Credentials;
    }

    // Getter
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public Credentials getCredentials() {
        return Credentials;
    }

    //Setter
    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void setPassword(Credentials Credentials) {
        this.Credentials = Credentials;
    }
    public String toString() {
        return personalInfo.toString() + "\n" + contactInfo.toString() + "\n" + Credentials.toString();
    }
}
