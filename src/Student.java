public class Student extends Person {
     private AcademicInfo academicInfo;

     // Constructor
     public Student(PersonalInfo personalInfo, AcademicInfo academicInfo, ContactInfo contactInfo) {
          super(personalInfo, contactInfo);
          setAcademicInfo(academicInfo);
     }

     // Getters
     public AcademicInfo getAcademicInfo() {
          return academicInfo;
     }

     // Setters
     public void setAcademicInfo(AcademicInfo academicInfo) {
          this.academicInfo = academicInfo;
     }

     // to String
     @Override
     public String toString() {
          return super.toString() + "\n " + getAcademicInfo();
     }
}
