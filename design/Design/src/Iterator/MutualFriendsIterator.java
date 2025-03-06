package Iterator;

public class MutualFriendsIterator implements UserIterator{
    Usershierarchy parent;
    private int MutualFriendsCounter = 0;
    public MutualFriendsIterator(Usershierarchy hierarchy) {
        this.parent = hierarchy;
    }
    @Override
    public String getNext() {
        if(hasNext())
        {
            System.out.println("mutual friends");
            return parent.getUsers().get(MutualFriendsCounter).getName();
        }
        else return null;

    }

    @Override
    public boolean hasNext() {
        if(MutualFriendsCounter<parent.getUsers().size())
        {
            MutualFriendsCounter++;

            return true;

        }
        return false;
    }
}
