package net.javaguides;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TransactionalAccount savingsAccount = new TransactionalAccount("12345", 5000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("67890", 10000, 5.5);

        savingsAccount.deposit(2000);
        savingsAccount.withdraw(3000);

        fixedDepositAccount.deposit(10000);

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(savingsAccount);
        reportGenerator.generateReport(fixedDepositAccount);

        NotificationService emailNotification = new EmailNotification();
        BankingSystem bankingSystem1 = new BankingSystem(emailNotification);
        bankingSystem1.processTransaction();

        NotificationService smsNotification = new SMSNotification();
        BankingSystem bankingSystem2 = new BankingSystem(smsNotification);
        bankingSystem2.processTransaction();


    }
}