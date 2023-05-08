package org.techit.week4.day1;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();
        for(int i=1; i<=9; i++){
            for(int j=0; j< star * i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
