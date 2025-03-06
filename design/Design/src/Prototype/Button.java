package Prototype;

public class Button {
    private String Color;
    private String YCoordinate;
    private String XCoordinate;
    private String content;

    public Button(String color, String content, String XCoordinate, String YCoordinate) {
        Color = color;
        this.content = content;
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
    }
    public Button CloneObject ()
    {
        return new Button(Color, content, XCoordinate, YCoordinate);
    }
    public void printinfo()
    {
        System.out.println("Color: " + Color);
        System.out.println("Content: " + content);
        System.out.println("XCoordinate: " + XCoordinate);
        System.out.println("YCoordinate: " + YCoordinate);
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getYCoordinate() {
        return YCoordinate;
    }

    public void setYCoordinate(String YCoordinate) {
        this.YCoordinate = YCoordinate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getXCoordinate() {
        return XCoordinate;
    }

    public void setXCoordinate(String XCoordinate) {
        this.XCoordinate = XCoordinate;
    }
}
