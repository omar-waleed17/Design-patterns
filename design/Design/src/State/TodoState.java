package State;

public class TodoState implements TaskState {
    private  TaskManager manager;
    public TodoState(TaskManager manager) {
        this.manager = manager;
    }



    @Override
    public void picktask() {
        System.out.println("already picked task");
    }

    @Override
    public void progresstask() {
        manager.ChangeState(new InProgressState(manager));
        System.out.println("progressing task");
    }

    @Override
    public void blocktask() {
        manager.ChangeState(new BlockedState(manager));
        System.out.println("from to do to blocked");
    }

    @Override
    public void reviewtask() {
        System.out.println("Cannot review task yet");
    }
    @Override
    public void finishtask() {
        System.out.println("cant finishhh task now");

    }
}
