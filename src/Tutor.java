public class Tutor extends User{

    public Tutor(String username) {
        super(username);
    }

    @Override
    public void accessDashboard(){
        System.out.println("-----TUTOR DASHBOARD-----");
        System.out.println("[View Bookings]");
        System.out.println("[Manage Students]");
    }
}
