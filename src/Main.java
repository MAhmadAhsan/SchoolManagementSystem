public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(new PersonalInfo("Ahmad", 23, "M", "27-11-2004", "Pakistani"), new ContactInfo("ahmadahsan7172@gmail.com", "03206338411", "mughal street tanda road jalalpur jattan"), new Credentials("42112222", "23jk2"));
        System.out.println(teacher);
    }
}