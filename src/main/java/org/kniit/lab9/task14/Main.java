package org.kniit.lab9.task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущий сигнал светофора (RED, YELLOW, GREEN): ");
        String light = scanner.nextLine();

        TrafficLight trafficLight = TrafficLight.valueOf(light);
        String nextLight = trafficLight.getNextLight();

        System.out.println("Следующий сигнал: " + nextLight);

        scanner.close();
    }
}
//Создайте Enum TrafficLight с состояниями светофора: RED, YELLOW, GREEN.
// Добавьте метод getNextLight(), который возвращает следующее состояние светофора.