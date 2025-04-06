public class ContactInfo {
    private String email;
    private String phoneNumber;
    private String address;

    public ContactInfo(String email, String phoneNumber, String address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
   public  String toString(){
        return "Email: " + email + "\nPhone: " + phoneNumber + "\nAddress: " + address;
   }
}