package org.kniit.lab10.task18;

public class Pair<T, U> {
    private T first;
    private U second;

    // Конструктор
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    //Геттеры и сеттеры
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" + first + ", " + second + "}";
    }


    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        pair.setSecond(35);
        System.out.println(pair.getSecond());

        Pair<String, String> namePair = new Pair<>("Имя", "Иван");
        Pair<Integer, Double> numericPair = new Pair<>(10, 3.14);

        System.out.println(namePair.getFirst() + ": " + namePair.getSecond());
        System.out.println(numericPair);
    }
}
