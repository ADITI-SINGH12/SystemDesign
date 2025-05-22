package stockmarket_ticker.observer;

public class MobileNotification implements StockMarketObserver{
    @Override
    public void notifyEveryone(String price) {
        System.out.println("Through Mobile Notification: TCS stock is at "+ price+ " now");
    }
}
