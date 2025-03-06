package strategy;

public class Email implements NotificationType {
    public void notifyme()
    {
        System.out.println(" this was sent by Email");
    }
}
