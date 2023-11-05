public class Main {
    public static void main(String[] args) {

        PurchaseFlowManager purchaseFlowManager=new PurchaseFlowManager(new NetBankingPaymentProcessor(),new EmailNotificationSender());
        purchaseFlowManager.triggerPurchaseFlow(1,2);
        System.out.println("***************");

        PurchaseFlowManager purchaseFlowManager1=new PurchaseFlowManager(new UPIPaymentProcessor(),new SMSNotificationsSender() );
        purchaseFlowManager1.triggerPurchaseFlow(1,2);
    }
}