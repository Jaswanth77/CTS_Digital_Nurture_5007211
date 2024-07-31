public class TestClass {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackSMSNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        slackSMSNotifier.send("Helloworld");
    }

}
