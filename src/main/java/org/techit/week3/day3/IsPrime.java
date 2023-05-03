package org.techit.week3.day3;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0; // 약수의 개수
        for (int i = 2; i < num; i++){
            if(num % i == 0) factors++;
        }
        // factors = 0
        System.out.println(factors==0 ? num +"은 소수입니다.": num+ "은 소수가 아닙니다." );
    }
}
