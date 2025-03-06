package memento;

import java.util.Stack;

public class MyHistory {
    private final Stack<DrawingEditorState> previousState;

    public MyHistory() {
        this.previousState = new Stack<>();

    }
    public void Save(DrawingEditorState currentstate)
    {
        previousState.push(currentstate);

    }
    public DrawingEditorState undo ()
    {
        DrawingEditorState currentstate = previousState.pop();

         return currentstate;

    }

}
