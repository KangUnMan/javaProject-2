package org.techit.week6.day1;

public class Circle implements Shape{

    private double radius;

    private final static double PIE = 3.14;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcularterArea() {

        return PIE*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return radius*2*PIE;
    }


}
