import java.util.List;
public class AcademicInfo {
    private String rollNo;
    private String major;
    private String department;
    private double GPA;
    private int year;
    private List<String> courses;
    private boolean isEnrolled;

    // Constructors
    public AcademicInfo(String rollNo, String major, String department, double GPA, int year, List<String> courses, boolean isEnrolled) {
        this.setRollNo(rollNo);
        this.setMajor(major);
        this.setDepartment(department);
        this.setGPA(GPA);
        this.setYear(year);
        this.setCourses(courses);
        this.setEnrolled(isEnrolled);
    }

    // Getters
    public String getRollNo() {
        return rollNo;
    }
    public String getMajor() {
        return major;
    }
    public String getDepartment() {
        return department;
    }
    public double getGPA() {
        return GPA;
    }
    public int getYear() {
        return year;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public boolean isEnrolled() {
        return isEnrolled;
    }

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public List<String> getCourses() {
        return courses;
    }
    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    // toStirng
    @Override
    public String toString() {
        return "RollNo :"+ getRollNo() + "\nMajor Subjects :"+ getMajor() + "\nDepartment :"+ getDepartment() + "\nGPA :"+ getGPA() + "\nYear :"+ getYear() + "\nCourses :"+ getCourses() + "\nisEnrolled :"+ isEnrolled();
    }
}
