package Question02;

public class Tutor implements Bookable{
    String name;
    int tutorID;

    public Tutor(String name,int tutorID) {
        this.name = name;
        this.tutorID = tutorID;
    }

    @Override
    public void book() {
        System.out.println("Booking tutor "+ name + " who has tutorID : " + tutorID);
    }

    @Override
    public void reschedule(){
        System.out.println("Rescheduling booking for tutor: " + name + " who has tutorID : " + tutorID);
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling booking for tutor "+ name + " who has tutorID : " + tutorID);
    }
}
