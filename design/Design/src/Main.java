
import Chain.*;
public class Main {
    public static void main(String[] args) {

DataHandler valid=new Validation();
        DataHandler form=new Format();
        DataHandler size =new Size();
        DataHandler info= new Info();
Data mydata=new Data(true,true,false,true);

        valid.setNext(form);
        form.setNext(size);
        size.setNext(info);
        valid.process(mydata);}
}