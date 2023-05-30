package org.techit.week6.day1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(3.5);
        System.out.println(shape.calcularterArea());
        System.out.println(shape.calculatePerimeter());
        Shape shape1 = new Rectangle(5,10);
        System.out.println(shape1.calcularterArea());
        System.out.println(shape1.calculatePerimeter());
    }
}
