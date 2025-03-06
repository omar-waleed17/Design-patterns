package Iterator;

import java.util.List;

public class Usershierarchy implements IterableCollection {
    private List<User> users;

    public Usershierarchy(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }



    @Override
    public FamilyIterator createFamilyiterator() { // make return type UserIterator its fine
        return new FamilyIterator(this);
    }

    @Override
    public FriendsIterator createFriendsiterator() {
        return new FriendsIterator(this);
    }

    @Override
    public MutualFriendsIterator createMutualFriendsterator() {
        return new MutualFriendsIterator(this);
    }
}
