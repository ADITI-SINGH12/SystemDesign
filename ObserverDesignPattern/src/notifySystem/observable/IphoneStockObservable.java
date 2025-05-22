package notifySystem.observable;

import notifySystem.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    String items;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifyEveryone() {
        for(NotificationAlertObserver notificationAlertObserver: notificationAlertObserverList){
            notificationAlertObserver.updateEveryone(items);
        }
    }

    @Override
    public void setItem(String item) {
    this.items = item;
    }
}
