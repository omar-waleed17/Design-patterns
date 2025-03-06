package State;

public class BacklogState implements TaskState{
    private  TaskManager manager;
    public BacklogState(TaskManager manager) {
        this.manager = manager;
    }



    @Override
    public void picktask() {
    manager.ChangeState(new TodoState(manager));
        System.out.println("picking task");
    }

    @Override
    public void progresstask() {
        System.out.println("Cannot progress task yet");
    }

    @Override
    public void blocktask() {
        System.out.println("ok changing from backlogged to blocked");
        manager.ChangeState(new BlockedState(manager));
    }

    @Override
    public void reviewtask() {
        System.out.println("Cannot review task yet");
    }
    @Override
    public void finishtask() {
        System.out.println("cant finish task now");

    }
}
