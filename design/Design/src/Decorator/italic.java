package Decorator;

public class italic extends TextDecorator{
    public italic(TextStyling textStyling) {
        super(textStyling);
    }

    @Override
    public void stylize() {
        super.stylize();
        System.out.print("italic");}
}
