package org.techit.codeup;

import java.util.Scanner;

public class CodeUp73 {
    public static void main(String[] args) {
        //73번
        Scanner sc = new Scanner(System.in);
        int zeroOrRepeat = -9999;
        while (zeroOrRepeat!=0){
            zeroOrRepeat = sc.nextInt();
            if(zeroOrRepeat!=0){
                System.out.printf("%d\n",zeroOrRepeat);
            }
        }
    }
}
