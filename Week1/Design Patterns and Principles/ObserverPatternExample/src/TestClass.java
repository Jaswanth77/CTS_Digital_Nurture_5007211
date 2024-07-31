public class TestClass {
    public static void main(String[] args) {
        // Create the stock market (subject)
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        // Change stock price and notify observers
        stockMarket.setStockPrice(150);
        stockMarket.setStockPrice(155);

        // Deregister an observer and change stock price again
        stockMarket.deRegister(mobileApp);
        stockMarket.setStockPrice(160);
    }
}
