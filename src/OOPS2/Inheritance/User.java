package OOPS2.Inheritance;

public class User {

    protected String username;
    protected String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    public void login(){
        System.out.println(username + " logged inn");
    }

    public void showDashboard(){
        System.out.println(username + "'s Dashboard");
    }
}
