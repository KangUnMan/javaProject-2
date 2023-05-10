package org.techit.week4.day3;

public abstract class ShapeDrawer {

    public void  printPyramidChar(int height){
        for(int i=0; i<height; i++){
            System.out.print(makeALine(height, i));
        }
    }

    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }
    public abstract String makeALine(int height, int i);
}
