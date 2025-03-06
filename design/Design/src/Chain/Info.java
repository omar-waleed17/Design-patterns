package Chain;

public class Info implements DataHandler{
    private DataHandler Handler;
    @Override
    public void setNext(DataHandler handler) {
        this.Handler=handler;
    }

    @Override
    public void process(Data data) {
        if(data.isInfo())
        {
            System.out.println("yeah info ok");
            if(Handler!=null) {
                Handler.process(  data);
            }
        }
        else
        {
            System.out.println("yeah not validated");
        }
    }
}
