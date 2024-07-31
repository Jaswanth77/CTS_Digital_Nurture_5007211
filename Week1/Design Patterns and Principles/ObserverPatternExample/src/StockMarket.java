import java.util.*;

public class StockMarket implements Stock {
    List<Observer> observers = new ArrayList<>();
    int stockPrice;

    public void setStockPrice(int price) {
        this.stockPrice = price;
        Notify();
    }


    public void register(Observer observer) {
        observers.add(observer);
    }


    public void deRegister(Observer observer) {
        observers.remove(observer);
    }


    public void Notify() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}
