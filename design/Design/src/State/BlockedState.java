package State;

public class BlockedState implements TaskState{
    private  TaskManager manager;
    public BlockedState(TaskManager manager) {
        this.manager = manager;
    }



    @Override
    public void picktask() {
        System.out.println("cant ur blocked task");
    }

    @Override
    public void progresstask() {
        System.out.println("cant ur blocked task");
    }

    @Override
    public void blocktask() {
        System.out.println("already blocked task");
    }

    @Override
    public void reviewtask() {
        System.out.println("cant ur blocked task");
    }
    @Override
    public void finishtask() {
        System.out.println("cant finis ur task  u blocked");

    }
}
