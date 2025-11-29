package org.kniit.lab5.task8;


import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] names = {"ноутбук", "смартфон", "наушники", "книга", "флешка"};
        Random random = new Random();
        ShopItem[] items = new ShopItem[100];

        for (int i = 0; i < 100; i++) {
            String name = names[random.nextInt(names.length)];
            double price = 10 + random.nextInt(20);
            int amount = 1 + random.nextInt(5);
            items[i] = new ShopItem(name, price, amount);
        }
        Arrays.sort(items, Comparator.comparing(ShopItem::getName));
        for (ShopItem item : items){
            System.out.println(item);
        }

        Set<ShopItem> unique = new HashSet<>(Arrays.asList(items));
        int duplicatesCount = items.length - unique.size();
        System.out.println("\nКоличество одинаковых продуктов: " + duplicatesCount);
    }
}
