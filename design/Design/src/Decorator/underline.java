package Decorator;

public class underline extends TextDecorator{
    public underline(TextStyling textStyling) {
        super(textStyling);
    }

    @Override
    public void stylize() {
        super.stylize();
        System.out.print("underline");}
}
