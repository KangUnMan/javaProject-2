package org.techit.week4.day3;

public class DimondDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int height, int i) {
        int pivot = height/2;
        if(i <= pivot){
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        }else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (height - i) - 1));
        }
    }
}
