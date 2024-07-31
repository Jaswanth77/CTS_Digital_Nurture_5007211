public class PaytmAdapter implements PaymentProcessor {
    public PaytmGateway paytmGateway;

    public PaytmAdapter(PaytmGateway paytmGateway)
    {
        this.paytmGateway = paytmGateway;
    }
    public void processPayment(int amount)
    {
        paytmGateway.makePayment(amount);
    }
}
