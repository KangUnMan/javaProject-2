package org.techit.week6.day1;

public class Rectangle implements Shape{
    private int height;
    private int wide;

    public Rectangle(int height, int wide) {
        this.height = height;
        this.wide = wide;
    }

    @Override
    public double calcularterArea() {
        return height*wide;
    }

    @Override
    public double calculatePerimeter() {
        return height*2+wide*2;
    }
}
