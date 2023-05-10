package org.techit.week4.day3;

import org.techit.week4.day3.inter.Printer2;

import java.io.IOException;

public abstract class ShapeDrawer implements Printer2 {

    public void  printPyramidChar(int height){
        for(int i=0; i<height; i++){
            System.out.print(makeALine(height, i));
        }
    }


    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }
    @Override
    public void print(String message) throws IOException {

    }

    public abstract String makeALine(int height, int i);
}
