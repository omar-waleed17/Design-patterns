package Command;

public class TextEditor {
    private String text;
    public TextEditor(String text) {
        this.text = text;
    }
    public void execute (TextCommands C)
    {
        C.execute();
    }
}
