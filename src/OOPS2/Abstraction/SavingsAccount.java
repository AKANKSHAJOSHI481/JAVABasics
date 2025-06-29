package OOPS2.Abstraction;

public class SavingsAccount extends BankAccount{

    public void deposit(){
        System.out.println("Please deposit in savings Account");
    };

    public void withdraw(){
        System.out.println("Please withdraw from savings account");
    }

    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount();
        obj1.deposit();
        obj1.withdraw();
    }
}
