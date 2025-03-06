package Chain;

public class Format implements DataHandler{
    private DataHandler Handler;
    @Override
    public void setNext(DataHandler handler) {
        this.Handler=handler;
    }

    @Override
    public void process(Data data) {
        if(data.isFormat())
        {
            System.out.println("yeah formatted");
            Handler.process(  data);
        }
        else
        {
            System.out.println("yeah not formatted");
        }
    }
}
