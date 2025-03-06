package State;

public class InReviewState implements TaskState{
    private  TaskManager manager;
    public InReviewState(TaskManager manager) {
        this.manager = manager;
    }



    @Override
    public void picktask() {
        System.out.println("already picked task");
    }

    @Override
    public void progresstask() {
        System.out.println("already progressed task");
    }

    @Override
    public void blocktask() {
        manager.ChangeState(new BlockedState(manager));
        System.out.println("from inreview to blocked");

    }

    @Override
    public void reviewtask() {
        System.out.println("reviewed task");


    }

    @Override
    public void finishtask() {
        System.out.println("finished task now");
        manager.ChangeState(new DoneState(manager));
    }
}
