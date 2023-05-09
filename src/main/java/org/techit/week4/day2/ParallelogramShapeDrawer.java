package org.techit.week4.day2;

public class ParallelogramShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int height, int i) {
        return String.format("%s%s\n"," ".repeat(height-i-1),"*".repeat(height));
    }
}
