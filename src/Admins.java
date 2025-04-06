public class Admins extends User {

    public Admins(String username) {
        super(username);
    }

    @Override
    public void accessDashboard(){
        System.out.println("-----ADMIN DASHBOARD-----");
        System.out.println("[View Students]");
        System.out.println("[View Tutors]");
        System.out.println("[View Tutors]");
        System.out.println("[System Settings]");

    }
}
