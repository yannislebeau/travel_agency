package fr.lernejo.travelsite;

import java.util.ArrayList;
import java.util.List;

public class UserHandling {

    public final List<User> userList;

    public UserHandling() {
        userList = new ArrayList<>();
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public User getUser(String userName) {
        for (User user : userList)
            if (user.userName().equalsIgnoreCase(userName))
                return user;
        return null;
    }
}
