public class ContactInfo {
    private String email;
    private String phoneNumber;
    private String address;

    // Constructor
    public ContactInfo(String email, String phoneNumber, String address) {
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
    }

    // Getters
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }

    // Setters
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public  String toString(){
        return "\nEmail: " + getEmail() + "\nPhone: " + getPhoneNumber() + "\nAddress: " + getAddress();
   }
}