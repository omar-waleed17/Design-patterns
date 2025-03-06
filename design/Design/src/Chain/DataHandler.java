package Chain;

public interface DataHandler {
    public void setNext(DataHandler handler);
    public void process(Data data);


}
