public class Main {
    public static void main(String[] args) {

        User u1 = new Student("Shashini");
        System.out.println();
        u1.login();
        u1.viewProfile();
        u1.accessDashboard();
        u1.logout();

        User u2 = new Tutor("Danilka");
        System.out.println();
        u2.accessDashboard();

        User u3 = new Admins("Chamathka");
        System.out.println();
        u3.accessDashboard();
    }
}