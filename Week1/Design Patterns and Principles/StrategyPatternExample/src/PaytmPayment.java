public class PaytmPayment implements PaymentStrategy {
    String email;

    public PaytmPayment(String email) {
        this.email = email;
    }

    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Paytm.");
        System.out.println("Paytm Email: " + email);
    }
}
