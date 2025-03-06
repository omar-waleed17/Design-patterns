package Command;

public class CutCommand implements TextCommands{
    private String Text;

    public CutCommand(String text) {
        Text = text;
    }

    @Override
    public void execute() {
        System.out.println(Text+ "has been cutted");
    }
}
