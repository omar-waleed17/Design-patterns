package observer;

public class subscriber {
    String name;

    public subscriber(String name) {
        this.name = name;
    }
    public void notify (String message)
    {
        System.out.println(message+ " please check it sir"+name);
}
}