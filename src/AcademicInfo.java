import java.util.List;

public class AcademicInfo {
    private RollNo rollNo;
    private String major;
    private String department;
    private double GPA;
    private int year;
    private List<String> courses;
    private boolean isEnrolled;

    public AcademicInfo(RollNo studentID, String major, String department, double GPA, int year, List<String> courses, boolean isEnrolled) {
        this.rollNo = studentID;
        this.major = major;
        this.department = department;
        this.GPA = GPA;
        this.year = year;
        this.courses = courses;
        this.isEnrolled = isEnrolled;
    }

    public RollNo getStudentID() { return rollNo; }
    public String getMajor() { return major; }
    public String getDepartment() { return department; }
    public double getGPA() { return GPA; }
    public int getYear() { return year; }
    public List<String> getCourses() { return courses; }
    public boolean isEnrolled() { return isEnrolled; }
    public String toString() {
        return "RollNo :"+ rollNo + "\nMajor Subjects :"+ major + "\nDepartment :"+ department + "\nGPA :"+ GPA + "\nYear :"+ year+ "\nCourses :"+ courses + "\nisEnrolled :"+ isEnrolled;
    }
}
