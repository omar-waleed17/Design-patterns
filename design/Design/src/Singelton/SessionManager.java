package Singelton;

import java.util.HashMap;

public class SessionManager {
    private static  int sessioncounter=0;
    private HashMap<User, Integer> SessionUsers;
    private static SessionManager instance;

    private SessionManager() {
        SessionUsers = new HashMap<>();
    }

    public static SessionManager getinstance()
    {
        if (instance==null)
        {
            synchronized (SessionManager.class) {
                instance = new SessionManager();
            }
        }

 return instance;
    }
    public void createSession(User user)
    {
        SessionUsers.put(user,sessioncounter++);
    }
    public void printinfo (User user)
    {
        System.out.println(user.getName());
        System.out.println(SessionUsers.get(user));
    }


}
