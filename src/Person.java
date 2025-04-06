public class Person {
    private PersonalInfo personalInfo;
    private ContactInfo contactInfo;

    // Constructor
    Person(PersonalInfo personalInfo, ContactInfo contactInfo) {
        this.setPersonalInfo(personalInfo);
        this.setContactInfo(contactInfo);
    }

    // Getters
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    // Setters
    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    // toString
    public String toString() {
        return getPersonalInfo() + "\n " + getContactInfo();
    }
}