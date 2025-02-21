package net.javaguides;

public class ReportGenerator {
    public void generateReport(BankingAccount account){
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Your current Balance : " + account.getBalance());
    }
}
