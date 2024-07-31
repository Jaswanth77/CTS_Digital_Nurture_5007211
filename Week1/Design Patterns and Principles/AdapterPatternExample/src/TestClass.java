public class TestClass {
    public static void main(String[] args) {

        PaytmGateway paytm = new PaytmGateway();
        PhonepeGateway phonepe = new PhonepeGateway();

        PaytmAdapter paytmadapter = new PaytmAdapter(paytm);
        PhonepeAdapter phonePeadapter = new PhonepeAdapter(phonepe);

        paytmadapter.processPayment(2000);
        phonePeadapter.processPayment(3000);
    }
}