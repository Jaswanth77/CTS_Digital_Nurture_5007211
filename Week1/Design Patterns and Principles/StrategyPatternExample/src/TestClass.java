public class TestClass {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");

        PaymentStrategy payPalPayment = new PaytmPayment("johnwick@example.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(250);

        System.out.println();

        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(150); 
    }
}
