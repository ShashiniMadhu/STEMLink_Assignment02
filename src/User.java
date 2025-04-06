public abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void login(){
        System.out.println(username + " has logged in to the VLE");
    }

    public void viewProfile(){
        System.out.println(username + " has viewed his/her profile");
    }

    public void logout(){
        System.out.println(username + " has logged out from the VLE");
    }

    public abstract void accessDashboard();
}
