package strategy;

public class NotificationService {
    private NotificationType notificationType;
    public NotificationService(NotificationType notificationType) {
        this.notificationType = notificationType;
    }
    public void sendNotification(User user, String message)
    {
        System.out.println(user.getName() +"got this message " + message +"by this service ");
         notificationType.notifyme();
    }
}
