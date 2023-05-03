package org.techit.week3.day3;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Hello");
            num = sc.nextInt();
        }while (num !=0);
    }
}
