public class Student extends User{

    public Student(String username) {
        super(username);
    }

    @Override
    public void accessDashboard(){
        System.out.println("-----STUDENT DASHBOARD-----");
        System.out.println("[View Sessions]");
        System.out.println("[View Tutors]");
    }
}
