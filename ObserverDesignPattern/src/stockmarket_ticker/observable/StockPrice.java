package stockmarket_ticker.observable;

import stockmarket_ticker.observer.StockMarketObserver;

public interface StockPrice {
    void setStockvalue(String item);
    void notifyStockInfo();
    void add(StockMarketObserver stockMarketObserver);
    void remove(StockMarketObserver stockMarketObserver);
}
