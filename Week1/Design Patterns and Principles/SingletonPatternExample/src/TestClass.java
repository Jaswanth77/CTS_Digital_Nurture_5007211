public class TestClass {
    public static void main(String[] args) {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();

        System.out.println("Singleton pattern test");
        if(instance1 == instance2)
        {
            System.out.println("Both are same instance");
        }
    }
}