package kz.bitlab.bootcamp.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Item> items = new ArrayList<>();

    static{
       items.add(new Item(1, "Iphone 13 Pro Max", 450000, 10));
       items.add(new Item(2, "XIAOMI REDMI NOTE", 82000, 20));
       items.add(new Item(3, "Oppo 3 Model X", 350000, 15));
       items.add(new Item(1, "Macbook Pro M1 13", 750000, 15));
       items.add(new Item(1, "ASUS TUF Gaming", 340000, 7));

    }

    public static ArrayList<Item>getItems(int id){
        return items;
    }

    public static void addItem(Item item){
        items.add(item);
    }

    public static void deleteItem(Item item){
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getId() == item.getId()){
                items.remove(i);
                break;
            }
        }
    }
//    public static void updateItem(Item item) {
//        for (int i = 0; i < items.size(); i++) {
//            if (items.get(i).getId() == item.getId()) {
//                items.set(i, item);
//                break;
//            }
//        }
//    }
}