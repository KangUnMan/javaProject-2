package org.techit.week4.day1;

import java.util.Scanner;

public class CodeUp1361 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int floor = sc.nextInt();
        String starSpace = "";
        for (int i = 0; i < floor; i++) {
            for (int j = 0; j <= 1; j++) {
                if (j != 0) {
                    starSpace += " ";
                }else {
                    System.out.printf("%s**", starSpace);
                }
            }
            System.out.println();
        }
    }
}
