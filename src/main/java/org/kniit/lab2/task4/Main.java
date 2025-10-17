package org.kniit.lab2.task4;

public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);
        Shape sphere = new Sphere(5);
        Shape cube = new Cube(8);
        Shape cylinder = new Cylinder(3, 10);

        System.out.println(container.add(sphere));
        System.out.println(container.add(cube));
        System.out.println(container.add(cylinder));

    }
}
