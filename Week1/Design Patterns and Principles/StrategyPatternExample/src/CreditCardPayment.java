
public class CreditCardPayment implements PaymentStrategy {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card.");

        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
    }
}
