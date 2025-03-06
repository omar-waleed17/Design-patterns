package State;

public class InProgressState implements TaskState{
    private  TaskManager manager;
    public InProgressState(TaskManager manager) {
        this.manager = manager;
    }



    @Override
    public void picktask() {
        System.out.println("already picked task");
    }

    @Override
    public void progresstask() {
        System.out.println("Cannot already in progress task yet");
    }

    @Override
    public void blocktask() {
        manager.ChangeState(new BlockedState(manager));
        System.out.println("from inprogress to blocked");

    }

    @Override
    public void reviewtask() {
        manager.ChangeState(new InReviewState(manager));
        System.out.println("reviewing task");

    }
    @Override
    public void finishtask() {
        System.out.println("cant finish task now");

    }
}
