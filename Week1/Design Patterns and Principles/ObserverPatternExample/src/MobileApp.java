public class MobileApp implements Observer {
    public void update(int stockPrice) {
        System.out.println("MobileApp: Stock price updated to Rs." + stockPrice);
    }
}
