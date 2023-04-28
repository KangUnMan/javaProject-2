package org.techit.codeup;

import java.util.Scanner;

public class CodeUp120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg1 = sc.nextInt();
        int avg2 = sc.nextInt();
        int avg3 = sc.nextInt();

        System.out.printf("%.2f",(avg1+avg2+avg3)/3.0f);
    }
}
