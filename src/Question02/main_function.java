package Question02;

public class main_function {
    public void processBooking(Bookable bookableEntity) {
        bookableEntity.book();
        bookableEntity.reschedule();
        bookableEntity.cancel();
    }

    public static void main(String[] args) {
        main_function bookingSystem = new main_function();

        Tutor tutor = new Tutor("John Doe",123);
        Session session = new Session(101);

        System.out.println();
        bookingSystem.processBooking(tutor);
        System.out.println();
        bookingSystem.processBooking(session);
    }
}
