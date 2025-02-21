package net.javaguides;

public class FixedDepositAccount extends BankingAccount implements DepositOperation{

    private double interestRate;

    public FixedDepositAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;

        System.out.println("Deposited " + amount + " into Fixed Deposit account...");
    }

    public double getInterestRate() {
        return interestRate;
    }
}
