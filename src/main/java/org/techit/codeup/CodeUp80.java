package org.techit.codeup;

import java.util.Scanner;

public class CodeUp80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plusAllNumber = sc.nextInt();
        int sum=0;
        int lastNum=0;
        for(int i=1; sum<plusAllNumber; i++){
            sum+=i;
            lastNum = i;
        }
        System.out.printf("%d",lastNum);
    }
}
