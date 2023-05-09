package org.techit.week4.day2;

public class ReversePyramid {

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = "0";

    public String formatReversePyramid(int height, int i){
        return String.format("%s%s\n",spaceChar.repeat(height-i),
                "*".repeat(2*i-1));
    }
    public void printReversePyramid(int height){
        for(int i=height; i>0; i--){
            System.out.print(formatReversePyramid(height,i));
        }
    }
    public static void main(String[] args) {

        ReversePyramid reversePyramid = new ReversePyramid(" ");
        reversePyramid.printReversePyramid(5);


    }
}
