public class PersonalInfo {
    private String name;
    private int age;
    private String gender;
    private String dateOfBirth;
    public String nationality;

    public PersonalInfo(String name, int age, String gender, String dateOfBirth, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.nationality=nationality;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getNationality() { return nationality; }
    public String toString() {
        return "Name : "+ name +"\nAge :  " + age + "\nGender :  " + gender + "\nDate of Birth : " + dateOfBirth+"\nNationality"+nationality;
    }
}