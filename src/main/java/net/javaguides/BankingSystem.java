package net.javaguides;

public class BankingSystem {
    private NotificationService notificationService;

    BankingSystem(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void processTransaction(){
        notificationService.sendNotification("Transaction completed Successfully.");
    }
}
