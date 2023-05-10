package org.techit.week4.day3;

public class Diex {
    public Diex(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void printshape(){
        shapeDrawer.printPyramidChar(5);
    }

    ShapeDrawer shapeDrawer;

}
