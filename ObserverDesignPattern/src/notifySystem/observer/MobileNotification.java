package notifySystem.observer;

public class MobileNotification implements NotificationAlertObserver {
    @Override
    public void updateEveryone(String item) {
        System.out.println("Mobile Messaage: You were searching for the item Stock is available now "+ item);
    }
}
