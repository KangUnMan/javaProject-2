package org.techit.week1;

import java.util.Scanner;

public class FloatFormatEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("%.1f", (scan.nextFloat()+scan.nextFloat()+scan.nextFloat())/3);
    }
}
