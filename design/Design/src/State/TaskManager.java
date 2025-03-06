package State;

public class TaskManager {
    private Task Mytask;
    private TaskState CurrentState;

    public TaskManager(Task mytask) {
        Mytask = mytask;
        CurrentState=new BacklogState(this);
    }
    public void ChangeState(TaskState newstate) {
        CurrentState=newstate;
    }
    public void picktask() {
       CurrentState.picktask();
    }


    public void progresstask() {
      CurrentState.progresstask();
    }


    public void blocktask() {
       CurrentState.blocktask();
    }


    public void reviewtask() {
      CurrentState.reviewtask();
    }
    public void finishtask() {
        CurrentState.finishtask();
    }
}
