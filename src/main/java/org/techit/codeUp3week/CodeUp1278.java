package org.techit.codeUp3week;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int cnt = 0;
        while (inputNum>0){
            inputNum /= 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
