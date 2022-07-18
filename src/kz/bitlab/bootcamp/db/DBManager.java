package kz.bitlab.bootcamp.db;
import java.util.ArrayList;

public class DBManager {
    private static ArrayList<User> users = new ArrayList<>();

    static{
        users.add(new User("Ilyas", "Zhuanyshev", "IT", 550000));
        users.add(new User("Aybek", "Bagit", "Management", 650000));
        users.add(new User("Alibek", "Serikov", "HR", 350000));
        users.add(new User("Serzhan", "Berikov", "IT", 450000));
        users.add(new User("Madina", "Mukhamejanova", "Management", 250000));
    }

    public static ArrayList<User>getUsers(){
        return users;
    }

    public static void addUser(User user){
        users.add(user);
    }
}

