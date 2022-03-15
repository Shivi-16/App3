package com.example.App3;

import java.util.ArrayList;
import java.util.List;

public class DBUser {
    private List<User> userTable = new ArrayList<User>();

    public DBUser() {
        userTable.add(new User(1, "Rammu", 30));
        userTable.add(new User(2, "Raka", 40));
    }

    public List<User> getAllUsers() {
        return userTable;
    }

    public User getAUser(int id) {
        for (User user : userTable) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public User getByname(String s)
    {
        for(User user : userTable)
        {
             if(user.getName().equals(s))
                 return user;
        }
        return null;
    }
    public User addUser(User user)
    {
        userTable.add(user);
        return user;
    }

    public boolean deleteAuser(int id)
    {
        for(User user : userTable)
        {
            if(user.getId()== id)
            {
                userTable.remove(user);
                return true;
            }
        }
        return false;
    }
}
