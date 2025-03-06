package Decorator;

public class Arabic implements TextStyling{
    public Arabic() {
    }

    @Override
    public void stylize() {
        System.out.print("arabic text");
    }
}
