package org.techit.codeup;

import java.util.Scanner;

public class CodeUp67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 67번
        int ifNum = sc.nextInt();
        if (ifNum < 0) {
            System.out.printf("minus\n");
        } else {
            System.out.printf("plus\n");
        }
        if (ifNum % 2 == 0) {
            System.out.printf("even\n");
        } else {
            System.out.printf("odd\n");
        }


    }
}
