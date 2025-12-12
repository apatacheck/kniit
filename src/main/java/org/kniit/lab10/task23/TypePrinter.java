package org.kniit.lab10.task23;
//Напишите универсальный метод printType,
// который принимает объект любого типа и выводит на экран имя его класса.
public class TypePrinter {
    public static <T> void printType(T obj) {
        if (obj == null) {
            System.out.println("null");
        } else {
            System.out.println(obj.getClass().getName());
        }
    }

    public static void main(String[] args) {
        printType(123);
        printType("Hello");
        printType(45.67);
        printType(true);
        printType(new int[0]);
        printType(null);
    }
}
