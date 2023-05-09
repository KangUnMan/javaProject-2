package org.techit.week4.day2;

public class Parallelogram {

    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = "0";

    public String formatParlleogram(int height ,int i){
        return String.format("%s%s\n",spaceChar.repeat(height-i-1),"*".repeat(height));
    }

    public void printParrlegram(int height){
        for(int i=0; i<height; i++){
            System.out.print(formatParlleogram(height,i));
        }
    }
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram("0");
        parallelogram.printParrlegram(4);

    }
}
