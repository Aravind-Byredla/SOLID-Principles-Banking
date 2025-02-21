package net.javaguides;

public class TransactionalAccount extends BankingAccount implements DepositOperation, WithdrawOperation{
    public TransactionalAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }


    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing "  + amount + " into Savings Deposit account...");
    }

    @Override
    public void withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Transactional Account");
        }else{
            System.out.println("Insufficient Funds....");
        }
    }
}
