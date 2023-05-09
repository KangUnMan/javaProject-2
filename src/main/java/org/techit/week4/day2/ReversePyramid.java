package org.techit.week4.day2;

public class ReversePyramid {

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = "0";
    public void printReversePyramid(int height){
        for(int i=0; i<height; i++){
            for(int j = 0; j < i ; j++){
                System.out.printf("%s",spaceChar);
            }
            for(int j = 0; j < height+2-i*2; j++){
                System.out.printf("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        ReversePyramid reversePyramid = new ReversePyramid(" ");
        reversePyramid.printReversePyramid(5);


    }
}
