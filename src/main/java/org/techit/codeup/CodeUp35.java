package org.techit.codeup;

import java.util.Scanner;

public class CodeUp35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hexNumber = scan.nextLine();
        int hex = Integer.parseInt(hexNumber,16);
        System.out.printf("%o",hex);
    }
}