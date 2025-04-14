package Question03;

public class ScheduledSession extends TutoringSession{

    public ScheduledSession(String sessionID){
        super(sessionID);
    }

    @Override
    public void notifyUsers(){
        System.out.println("Session reminder of session ID : "+sessionID);
    }

    @Override
    public void updateStatus(){
        System.out.println("Updated the session status to 'SCHEDULED' ");
    }
}
