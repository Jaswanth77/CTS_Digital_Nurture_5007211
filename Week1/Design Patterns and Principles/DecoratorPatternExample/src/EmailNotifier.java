public class EmailNotifier implements Notifier{
    public void send(String msg)
    {
        System.out.println("The message via Email:"+msg);
    }
}
