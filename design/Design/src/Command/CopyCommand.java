package Command;

public class CopyCommand  implements TextCommands{
    private String Text;

    public CopyCommand(String text) {
        Text = text;
    }

    @Override
    public void execute() {
        System.out.println(Text+ "has been copied");
    }
}
