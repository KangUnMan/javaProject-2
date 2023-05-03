package org.techit.codeup;

import java.util.Scanner;

public class CodeUp89 {
    // 89번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startVar = sc.nextInt();
        int ap = sc.nextInt();
        int or = sc.nextInt();

        for(int i=1; i<or; i++){
            startVar+=ap;
        }
        System.out.println(startVar);
    }
}
