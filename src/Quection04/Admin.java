package Quection04;

public class Admin implements ReportGenerator,Communicator{
    protected String name;

    public Admin(String name){
        this.name = name;
    }

    @Override
    public void generateReport(){
        System.out.println("REPORT 01");
    }

    @Override
    public void sendAnnouncements(){
        System.out.println("Announcement 01 by "+name);
    }
}
