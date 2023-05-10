package org.techit.week4.day3;

public class Diex {
    public Diex(int num) {
        this.num = num;
    }

    int num;
    public Diex(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void printshape(int num){
        shapeDrawer.printPyramidChar(num);
    }

    ShapeDrawer shapeDrawer;

}
