package org.techit.codeup;

import java.util.Scanner;

public class CodeUp63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int greaterThanNum1 = sc.nextInt();
        int greaterThanNum2 = sc.nextInt();

        System.out.printf("%d",greaterThanNum1>greaterThanNum2 ? greaterThanNum1:greaterThanNum2);
    }
}
