package memento;

public class DrawingEditorState {
    private String Content;
    private String Color;
    private String border;

    public DrawingEditorState(String content, String color, String border) {
        this.Content = content;
        this.Color = color;
        this.border = border;
    }

    public String getContent() {
        return Content;
    }

    public String getColor() {
        return Color;
    }

    public String getBorder() {
        return border;
    }
}
