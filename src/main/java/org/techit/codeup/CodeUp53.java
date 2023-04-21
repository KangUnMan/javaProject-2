package org.techit.codeup;

import java.util.Scanner;

public class CodeUp53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zeroTF = scan.nextInt();
        boolean zeroTrue = zeroTF==0;
        System.out.printf("%d",zeroTrue ? 1 : 0);
    }
}
