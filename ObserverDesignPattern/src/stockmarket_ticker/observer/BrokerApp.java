package stockmarket_ticker.observer;

public class BrokerApp implements StockMarketObserver{
    @Override
    public void notifyEveryone(String price) {
        System.out.println("Through Broker App: TCS stock is at "+ price+ " now");
    }
}
