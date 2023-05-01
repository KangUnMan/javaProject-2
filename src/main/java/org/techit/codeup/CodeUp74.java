package org.techit.codeup;

import java.util.Scanner;

public class CodeUp74 {
    public static void main(String[] args) {
        //74번 역순출력
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        while (repeat>0){
            System.out.printf("%d\n",repeat);
            repeat--;
        }
    }
}
