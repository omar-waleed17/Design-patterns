package Decorator;

public class English implements TextStyling{
    @Override
    public void stylize() {
        System.out.print("english text");
    }
}
