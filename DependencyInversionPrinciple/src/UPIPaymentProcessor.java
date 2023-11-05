public class UPIPaymentProcessor implements PaymentProcessor{

    @Override
    public void processPayment(int productId, int customerId) {
        System.out.println("UPIPayment processing");
    }
}
