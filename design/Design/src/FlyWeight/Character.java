package FlyWeight;

public class Character  implements TextElement{
    public Character() {

    }

    @Override
    public void font() {
        System.out.println("char font");
    }

    @Override
    public void color() {
        System.out.println("char color");
    }

    @Override
    public void size() {
        System.out.println("char size");
    }

    @Override
    public void style() {
        System.out.println("char style");
    }
}
