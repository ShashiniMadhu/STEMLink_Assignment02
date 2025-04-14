package Question02;

public class Session implements Bookable {
    int sessionNumber;

    public Session(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    @Override
    public void book() {
        System.out.println(sessionNumber + " has already booked");
    }

    @Override
    public void reschedule(){
        System.out.println(sessionNumber + " going to be reschedule");
    }

    @Override
    public void cancel() {
        System.out.println(sessionNumber + " has cancelled due to requests");
    }
}
