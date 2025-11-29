package org.kniit.lab5.task8;

import java.util.Objects;

public class ShopItem {
    private String name;
    private double price;
    private int amount;

    public ShopItem(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Товар:" + name + " [Цена:" + price + ", Кол-во:" + amount + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof ShopItem)) {
            System.out.println("Нельзя сравнивать объекты разных типов!!");
            return false;
        } else {
            ShopItem other = (ShopItem) obj;
            return Double.compare(other.price, price) == 0 &&  amount == other.amount && Objects.equals(name, other.name);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amount);
    }
}
