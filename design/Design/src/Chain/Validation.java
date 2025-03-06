package Chain;



public class Validation implements  DataHandler {
    private DataHandler Handler;
    @Override
    public void setNext(DataHandler handler) {
        this.Handler=handler;
    }

    @Override
    public void process(Data data) {
        if(data.isValidated())
        {
            System.out.println("yeah validated");
           Handler.process(  data);
        }
        else
        {
            System.out.println("yeah not validated");
        }
    }
}
