package notifySystem.observable;

import notifySystem.observer.NotificationAlertObserver;

public interface StockObservable {
void add(NotificationAlertObserver notificationAlertObserver);
void remove(NotificationAlertObserver notificationAlertObserver);
void notifyEveryone();
void setItem(String item);
}
