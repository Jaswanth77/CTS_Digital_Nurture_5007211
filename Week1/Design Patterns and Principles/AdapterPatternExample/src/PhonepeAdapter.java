
public class PhonepeAdapter implements PaymentProcessor {
    public PhonepeGateway phonepeGateway;

    public PhonepeAdapter(PhonepeGateway phonepeGateway)
    {
        this.phonepeGateway = phonepeGateway;
    }

    public void processPayment(int amount)
    {
        phonepeGateway.makePayment(amount);
    }
}
