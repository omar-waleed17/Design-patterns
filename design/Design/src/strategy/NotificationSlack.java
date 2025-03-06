package strategy;

public class NotificationSlack implements NotificationType{
    @Override
    public void notifyme() {
        System.out.println("this message was sent by slack");
    }
}
