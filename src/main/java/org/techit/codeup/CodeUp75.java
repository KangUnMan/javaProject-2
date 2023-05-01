package org.techit.codeup;

import java.util.Scanner;

public class CodeUp75 {
    public static void main(String[] args) {
        //75번 역순 출력2
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        while (repeat!=0){
            System.out.printf("%d\n",repeat-1);
            repeat--;
        }
    }
}