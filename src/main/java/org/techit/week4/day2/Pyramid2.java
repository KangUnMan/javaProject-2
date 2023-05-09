package org.techit.week4.day2;

public class Pyramid2 {
    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = "0";
    public void pyramidPrint(int height){
        for(int i = 0; i < height; i++){
            for(int j= 0; j < height - i - 1; j++){
                System.out.printf("%s",spaceChar);
            }
            for(int j= 0; j < 2 * i - 1; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int height = 4;
        Pyramid2 pyramid2 = new Pyramid2("1");
        pyramid2.pyramidPrint(4);
        Pyramid2 pyramid3 = new Pyramid2("0");
        pyramid3.pyramidPrint(6);
    }
}
