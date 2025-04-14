package Question03;

public abstract class TutoringSession {
    protected String sessionID;

    public TutoringSession(String sessionID){
        this.sessionID = sessionID ;
    }

    public abstract void notifyUsers();
    public abstract void updateStatus();
}
