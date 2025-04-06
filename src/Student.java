public class Student {
     private PersonalInfo personalInfo;
     private AcademicInfo academicInfo;
     private ContactInfo contactInfo;

     public Student(PersonalInfo personalInfo, AcademicInfo academicInfo, ContactInfo contactInfo) {
          this.personalInfo = personalInfo;
          this.academicInfo = academicInfo;
          this.contactInfo = contactInfo;
     }

     // Setter
     public void setPersonalInfo(PersonalInfo personalInfo) {
          this.personalInfo = personalInfo;
     }

     public void setAcademicInfo(AcademicInfo academicInfo) {
          this.academicInfo = academicInfo;
     }

     public void setContactInfo(ContactInfo contactInfo) {
          this.contactInfo = contactInfo;
     }
     // Getter
     public PersonalInfo getPersonalInfo() {
          return personalInfo;
     }

     public AcademicInfo getAcademicInfo() {
          return academicInfo;
     }

     public ContactInfo getContactInfo() {
          return contactInfo;
     }

     public String toString() {
          return personalInfo.toString() + "\n " + academicInfo.toString() + "\n " + contactInfo.toString();
     }
}
