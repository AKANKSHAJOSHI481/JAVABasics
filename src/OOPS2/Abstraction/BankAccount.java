package OOPS2.Abstraction;

abstract public class BankAccount {

    long accNo;
    int balance;

    abstract void deposit();
    abstract void withdraw();

    public int getBalance() {
        return balance;
    }
}

