public class PersonalInfo {
    private String name;
    private int age;
    private String gender;
    private String dateOfBirth;

    public PersonalInfo(String name, int age, String gender, String dateOfBirth, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getDateOfBirth() { return dateOfBirth; }
}