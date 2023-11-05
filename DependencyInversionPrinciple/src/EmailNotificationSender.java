import java.sql.SQLOutput;

public class EmailNotificationSender implements NotificationSender{
    @Override
    public void sendNotification(int productId, int customerId) {
        System.out.println("EmailNotification Sender seding Notifiactions...");
    }
}
