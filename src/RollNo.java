public class RollNo {
    private String rollNo;

    // Constructor
    public RollNo(String rollNo) {
        setRollNo(rollNo);
    }
    // toString method
    @Override
    public String toString() {
        return rollNo;
    }

    // Getter
    public String getRollNo() {
        return this.rollNo;
    }

    // Setter
    public void setRollNo(String rollNo) {
        if (rollNo.length() == 10) {
            this.rollNo = rollNo;
        }else{
            throw new IllegalArgumentException("Roll No must be 10 digits");
        }
    }
}
