package org.techit.codeup;

import java.util.Scanner;

public class CodeUp121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calNum1 = sc.nextInt();
        int calNum2 = sc.nextInt();

        System.out.printf("%d",calNum1%calNum2);
    }
}
