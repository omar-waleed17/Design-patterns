package Decorator;

public class bold extends TextDecorator{
    public bold(TextStyling textStyling) {
        super(textStyling);
    }

    @Override
    public void stylize() {
        super.stylize();
        System.out.print("bold");}
}
