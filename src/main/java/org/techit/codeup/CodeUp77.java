package org.techit.codeup;

import java.util.Scanner;

public class CodeUp77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //이렇게 처리하는게 일반적이라고 합니다.
        int decNum = sc.nextInt();
        for(int i=0; i<=decNum; i++){
            System.out.printf("%d\n",i);
        }
    }
}