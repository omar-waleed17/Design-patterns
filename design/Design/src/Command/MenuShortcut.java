package Command;

import java.util.HashMap;
import java.util.Map;

public class MenuShortcut {
    private Map<String,TextCommands> shortcuts;
    public MenuShortcut() {
        this.shortcuts = new HashMap<String,TextCommands>();
    }
    public void addShortcut(String shortcut, TextCommands command) {
        this.shortcuts.put(shortcut, command);
    }
    public void execute(String CurrenShortCut) {
        shortcuts.get(CurrenShortCut).execute();
    }
}
