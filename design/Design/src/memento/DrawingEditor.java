package memento;

public class DrawingEditor {
    private String Content;
    private String Color;
    private String border;

    public DrawingEditor() {
        this.Content ="" ;
        this.Color = "";
        this.border = "";
    }
    public DrawingEditorState save()
    {
        return new DrawingEditorState(Content,Color,border);
    }
    public void restore(DrawingEditorState state)
    {
        this.Content=state.getContent();
        this.Color=state.getColor();
        this.border=state.getBorder();

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

    public void setContent(String content) {
        Content = content;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setBorder(String border) {
        this.border = border;
    }
}
