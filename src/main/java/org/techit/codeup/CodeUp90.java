package org.techit.codeup;

import java.util.Scanner;

public class CodeUp90 { // 90번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startVar = sc.nextInt();
        int ap = sc.nextInt();
        int or = sc.nextInt();

        for(int i=1; i<or; i++){
            startVar= startVar*ap;
        }
        System.out.println(startVar);
    }
}
