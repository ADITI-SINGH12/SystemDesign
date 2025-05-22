package stockmarket_ticker.observable;

import stockmarket_ticker.observer.StockMarketObserver;

import java.util.ArrayList;
import java.util.List;

public class TCSstock implements StockPrice{
    String item;
    List<StockMarketObserver> stockMarketObserverList = new ArrayList<>();


    @Override
    public void setStockvalue(String item) {
        this.item=item;
    }

    @Override
    public void notifyStockInfo() {
for(StockMarketObserver stockMarketObserver: stockMarketObserverList){
    stockMarketObserver.notifyEveryone(item);
}
    }

    @Override
    public void add(StockMarketObserver stockMarketObserver) {
        stockMarketObserverList.add(stockMarketObserver);
    }

    @Override
    public void remove(StockMarketObserver stockMarketObserver) {
       stockMarketObserverList.remove(stockMarketObserver);
    }
}
