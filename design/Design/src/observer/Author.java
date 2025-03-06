package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Author {
    String name;
    List<blog> Myblogs;
    List <newsletter> Mynewsletters;
    Map<Journal,List <subscriber>> Storage;

    public Author(String name) {
        this.name=name;
        Myblogs=new ArrayList<>();
        Mynewsletters=new ArrayList<>();
        Storage=new HashMap<>();
        Storage.put(Journal.BLOGPOST, new ArrayList<>());
        Storage.put(Journal.NEWSLETTER, new ArrayList<>());

    }
    public void addnewsletter( newsletter n) {
        Mynewsletters.add(n);
        String message="this newsletter was addded"+ n.getName();
        notification(Journal.NEWSLETTER, message);
    }
    public void addblog( blog b) {
        Myblogs.add(b);
        String message="this blog was addded"+ b.getName();
        notification(Journal.BLOGPOST, message);
    }
    public void subscribe (Journal type,subscriber customer)
    {
        Storage.get(type).add(customer);
    }
    public void unsubscribe (Journal type,subscriber customer)
    {
        Storage.get(type).remove( customer );
    }
    public void notification (Journal type, String message)
    {

        for (int i=0;i<Storage.get(type).size();i++)
        {
            Storage.get(type).get(i).notify(message);
}}
}
