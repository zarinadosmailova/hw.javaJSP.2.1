package kz.bitlab.bootcamp.db;

import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;

public class DBManager {
    private static ArrayList<User> users = new ArrayList<>();

    static{
        users.add(new User("Zarina", "Dosmailova"));

    }

    public static ArrayList<User>getUsers(){
        return users;
    }

    public static void addUser(User user){
        users.add(user);
    }
}