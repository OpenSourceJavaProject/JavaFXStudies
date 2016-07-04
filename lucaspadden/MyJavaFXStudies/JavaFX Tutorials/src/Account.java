/**
 * Created by Dynee on 6/1/16.
 */
public final class Account {

    // instance variables
    private int accountId;
    private final String accountHolderName;
    private int accountPin;
    private double balance;

    // constructor for account class
    public Account(int id, String holderName, int pin, double bal) {

        this.accountId = id;
        this.accountHolderName = holderName;
        this.accountPin = pin;
        this.balance = bal;
    }

    // getter and setters
    public void setId(int accountId) {
        this.accountId = accountId;
    }

    public void setPin(int pin) {
        this.accountPin = pin;
    }

    public int getId() {
        return this.accountId;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public int getPin() {
        return this.accountPin;
    }

    // deposit and withdraw money
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // check balance
    public double getBalance() {
        return this.balance;
    }
}

