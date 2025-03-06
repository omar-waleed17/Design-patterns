package State;

public class DoneState implements TaskState{
    private  TaskManager manager;
    public DoneState(TaskManager manager) {
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
        System.out.println("Cannot block task we are already done");

    }

    @Override
    public void reviewtask() {
        System.out.println("already reviewed task");

    }

    @Override
    public void finishtask() {
        System.out.println("already finished task");
    }
}
