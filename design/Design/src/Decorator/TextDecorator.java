package Decorator;

import java.sql.SQLOutput;

public class TextDecorator implements TextStyling{
    private TextStyling textStyling;
    public TextDecorator(TextStyling textStyling) {
        this.textStyling = textStyling;

    }

    @Override
    public void stylize() {
        textStyling.stylize();

    }
}
