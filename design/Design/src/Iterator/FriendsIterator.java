package Iterator;

public class FriendsIterator implements UserIterator{
    Usershierarchy parent;
    private  int FriendsCounter=0;
    public FriendsIterator(Usershierarchy hierarchy) {
        this.parent = hierarchy;
    }
    @Override
    public String getNext() {
        if(hasNext())
        {
            return parent.getUsers().get(FriendsCounter).getName();
        }
        else return null;

    }

    @Override
    public boolean hasNext() {
        if(FriendsCounter<parent.getUsers().size())
        { FriendsCounter++;

            return true;

        }
        return false;
    }
}
