package stockmarket_ticker;


import stockmarket_ticker.observable.StockPrice;
import stockmarket_ticker.observable.TCSstock;
import stockmarket_ticker.observer.BrokerApp;
import stockmarket_ticker.observer.MobileNotification;
import stockmarket_ticker.observer.NewsWebsite;

public class ClientCall {
    public static void main(String[] args) {
        StockPrice stockPrice = new TCSstock();
        stockPrice.add(new BrokerApp());
        stockPrice.add(new MobileNotification());
        stockPrice.add(new NewsWebsite());
        stockPrice.setStockvalue("Rs 15");
        stockPrice.notifyStockInfo();
    }
}
