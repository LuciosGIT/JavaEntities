package entities;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(int number, String holder, double deposit) {
        this.accountNumber = number;
        this.accountHolder = holder;
        this.balance = deposit;
    }

    public void depositValue(double value) {
        this.balance += value;
    }
    public void withdrawnValue(double value) {
        this.balance -= value;
        this.balance -= 5.00;
    }


    public String toString() {
        return "Account " + this.accountNumber +  ", Holder: " + this.accountHolder + ", Balance: $ "  + this.balance ;
    }


}
