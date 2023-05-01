package org.techit.codeup;

import java.util.Scanner;

public class CodeUp71 {
    // 입력된 값이 0이 아니면 반복
    public static void main(String[] args) {
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
