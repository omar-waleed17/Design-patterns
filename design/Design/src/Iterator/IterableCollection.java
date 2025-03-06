package Iterator;

public interface IterableCollection {
    public FamilyIterator createFamilyiterator();
    public FriendsIterator createFriendsiterator();
    public MutualFriendsIterator createMutualFriendsterator();
}
