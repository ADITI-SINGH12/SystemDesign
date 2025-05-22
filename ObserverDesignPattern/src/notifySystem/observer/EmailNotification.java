package notifySystem.observer;

public class EmailNotification implements NotificationAlertObserver{
    @Override
    public void updateEveryone(String item) {
        System.out.println("Email Message: You were searching for the item Stock is available now"+ item);
    }
}
