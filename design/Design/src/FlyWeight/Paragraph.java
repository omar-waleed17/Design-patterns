package FlyWeight;

public class Paragraph implements TextElement {
    @Override
    public void font() {
        System.out.println("paragraph font");
    }

    @Override
    public void color() {
        System.out.println("paragraph color");
    }

    @Override
    public void size() {
        System.out.println("paragraph size");
    }

    @Override
    public void style() {
        System.out.println("paragraph style");
    }
}
