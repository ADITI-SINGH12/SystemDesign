package notifySystem;

import notifySystem.observable.IphoneStockObservable;
import notifySystem.observable.StockObservable;
import notifySystem.observer.EmailNotification;
import notifySystem.observer.MobileNotification;
import notifySystem.observer.NotificationAlertObserver;

public class Stocks {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneStockObservable();
        NotificationAlertObserver mobileNotify = new MobileNotification();
        NotificationAlertObserver emailNotify = new EmailNotification();
        stockObservable.setItem("Bulb");
        stockObservable.add(mobileNotify);
        stockObservable.add(emailNotify);
        stockObservable.notifyEveryone();
    }
}
