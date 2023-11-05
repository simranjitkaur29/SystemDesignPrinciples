public class SMSNotificationsSender implements NotificationSender{
    @Override
    public void sendNotification(int productId, int customerId) {
        System.out.println("EmailNotificationSender sending notification...");
    }
}
