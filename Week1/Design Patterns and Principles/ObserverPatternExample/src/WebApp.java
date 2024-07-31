public class WebApp implements Observer {
    @Override
    public void update(int stockPrice) {
        System.out.println("WebApp: Stock price updated to Rs." + stockPrice);
    }
}
