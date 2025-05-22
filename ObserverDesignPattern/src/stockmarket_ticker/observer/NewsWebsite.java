package stockmarket_ticker.observer;

public class NewsWebsite implements StockMarketObserver{
    @Override
    public void notifyEveryone(String price) {
        System.out.println("Through News Website: TCS stock is at "+ price+ " now");
    }
}
