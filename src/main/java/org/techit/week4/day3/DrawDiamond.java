package org.techit.week4.day3;

public class DrawDiamond {




    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public String makeALine(int height, int i) {
        int pivot = height/2;
        if(i <= pivot){
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        }else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (height - i) - 1));
        }
    }
    public static void main(String[] args) {
        int h = 5;
        DrawDiamond drawDiamond = new DrawDiamond();
        for (int i = 0; i < h; i++) {
            System.out.printf("%s",drawDiamond.makeALine(h,i));
        }
    }
}