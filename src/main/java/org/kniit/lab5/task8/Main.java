package org.kniit.lab5.task8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Книга", "Ручка", "Блокнот", "Пенал", "Линейка"};
        Random random = new Random();
        ShopItem[] items = new ShopItem[100];
        // генерируем тестовые данные
        for (int i = 0; i < items.length; i++) {
            String name = names[random.nextInt(names.length)];
            double price = 10 + random.nextInt(5) * 5;
            int quantity = random.nextInt(10);

            items[i] = new ShopItem(name, price, quantity);
        }
        Arrays.sort(items, Comparator.comparing(ShopItem::getName));
        for (ShopItem item : items) {
            System.out.println(item);
        }

        Set<ShopItem> unique = new HashSet<>(Arrays.asList(items));
        int duplicatesCount = items.length - unique.size();
        System.out.println("\nКоличество одинаковых объектов: " + duplicatesCount);
    }
}
