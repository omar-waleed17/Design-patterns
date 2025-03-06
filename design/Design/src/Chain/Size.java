package Chain;

public class Size implements DataHandler{
    private DataHandler Handler;
    @Override
    public void setNext(DataHandler handler) {
        this.Handler=handler;
    }

    @Override
    public void process(Data data) {
        if(data.isSize())
        {
            System.out.println("yeah size ok");
            Handler.process(  data);
        }
        else
        {
            System.out.println("yeah not  size ok");
        }
    }
}
