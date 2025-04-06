public class PersonalInfo {
    private String name;
    private int age;
    private String gender;
    private String dateOfBirth;
    private String nationality;

    // Constructor
    public PersonalInfo(String name, int age, String gender, String dateOfBirth, String nationality) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setDateOfBirth(dateOfBirth);
        this.setNationality(nationality);
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getNationality() {
        return nationality;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // toString
    @Override
    public String toString() {
        return "Name : "+ getName() +"\nAge :  " + getAge() + "\nGender :  " + getGender() + "\nDate of Birth : " + getDateOfBirth() +"\nNationality: "+ getNationality();
    }
}