package org.techit.week4.day2;

public class ReversePyramid {

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = "0";

    public String formatReversePyramid(int height, int i){
        return String.format("%s%s\n",spaceChar.repeat(height+i),
                "*".repeat(2*(height-i)-1));
    }

    public String formatParlleogram(int height ,int i){
        return String.format("%s%s\n",spaceChar.repeat(height-i-1),"*".repeat(height));
    }

    public void printReversePyramid(int height){
        for(int i=0; i<height; i++){
            System.out.print(formatReversePyramid(height,i));
        }
    }
    public static void main(String[] args) {

        ReversePyramid reversePyramid = new ReversePyramid(" ");
        reversePyramid.printReversePyramid(5);


    }
}
