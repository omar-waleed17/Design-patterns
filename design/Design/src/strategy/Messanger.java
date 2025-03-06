package strategy;

public class Messanger implements NotificationType{
    @Override
    public void notifyme() {
        System.out.println(" this was sent by messanger");
    }
}
