package OOPS2.Inheritance;

public class SellerUser extends User{

    public SellerUser(String username, String email){
        super(username, email);
    }

    public void addProducts(){
        System.out.println("Seller is adding a new product");
    }

    @Override
    public void showDashboard(){
        System.out.println("Seller user personailsed dashboard");
    }
}
