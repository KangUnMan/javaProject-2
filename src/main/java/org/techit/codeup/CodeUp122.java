package org.techit.codeup;

import java.util.Scanner;

public class CodeUp122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        System.out.printf("%d %d",sec/60,sec%60);
    }
}
