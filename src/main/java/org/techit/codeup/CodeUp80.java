package org.techit.codeup;

import java.util.Scanner;

public class CodeUp80 {
    public static void main(String[] args) {
        //입력한 정수보다 같거나 작을때까지 반복
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
