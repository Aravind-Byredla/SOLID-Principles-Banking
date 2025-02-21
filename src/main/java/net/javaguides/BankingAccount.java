package net.javaguides;

public class BankingAccount {
    private final String accountNumber;
    protected double balance;

    public BankingAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
