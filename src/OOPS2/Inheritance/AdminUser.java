package OOPS2.Inheritance;

public class AdminUser extends User{

    public AdminUser(String username, String email){
        super(username, email);
    }

    public void manageProducts(){
        System.out.println("Admin is managing products");

    }

    public void updateUsername(){
        System.out.println(username + "'s username needs to be updated");
    }
    @Override
    public void showDashboard(){
        super.showDashboard();
        System.out.println("Admin user personailsed dashboard");
    }
    public static void main(String[] args) {
        AdminUser au = new AdminUser("akanksha", "josjakankdsjas");
        au.login();
        au.showDashboard();
        au.updateUsername();
    }

}
