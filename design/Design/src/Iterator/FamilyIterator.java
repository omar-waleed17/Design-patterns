package Iterator;

public class FamilyIterator implements UserIterator {
    Usershierarchy parent;
    private int FamilyCounter=0;
    public FamilyIterator(Usershierarchy hierarchy) {
        this.parent = hierarchy;
    }

    public String getNext() {
        if(hasNext())
        {

            System.out.println(" family");
            return parent.getUsers().get(FamilyCounter++).getName();

        }
        else return null;

    }

    @Override
    public boolean hasNext() {
        if(FamilyCounter<parent.getUsers().size())
        {

            return true;

        }
        return false;
    }
}
