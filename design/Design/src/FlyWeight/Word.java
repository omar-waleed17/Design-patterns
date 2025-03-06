package FlyWeight;

public class Word implements TextElement{
private static int counter=0;

    @Override
    public void font() {
        System.out.println("Word font");
    }

    @Override
    public void color() {
        System.out.println("Word color" + counter);
        counter++;
    }

    @Override
    public void size() {
        System.out.println("Word size");
    }

    @Override
    public void style() {
        System.out.println("word style");
    }
}
