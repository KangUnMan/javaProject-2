package org.techit.week4.day1;

public class PyramidStar {
    public static void main(String[] args) {
        int height = 3;
        for (int i = 0; i < height; i++) { //전체 Root
            for (int j = 0; j < height - i -1; j++) { // 2 1 0
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }

    }
}
