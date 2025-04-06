public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(new PersonalInfo("Ahmad", 20,"M", "27-11-24", "Pakistani"),new ContactInfo("ahmadahsan7172@gmail.com","0320-6338411", "Mughal street Tanda Road Jalalpur Jattan"),new Credentials("Mbhai34201&","ahmad7173"));
        System.out.println(admin.getCredentials());
    }
}