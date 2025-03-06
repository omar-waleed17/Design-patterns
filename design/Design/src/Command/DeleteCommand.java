package Command;

public class DeleteCommand implements TextCommands{
    private String Text;

    public DeleteCommand(String text) {
        Text = text;
    }

    @Override
    public void execute() {
        System.out.println(Text+ "has been deleted");
    }
}
