package org.techit.codeup;

import java.util.Scanner;

public class CodeUp92 {
    public static void main(String[] args) {
        // 입력주기가 겹치는날을 구하는 문제.
        Scanner sc = new Scanner(System.in);
        int kang = sc.nextInt(); //모두 같이 문제를 푸는 주기
        int kim = sc.nextInt();
        int jo = sc.nextInt();
        int day=1; // 점점 더 해질 날짜.
        while(day%kang!=0||day%kim!=0||day%jo!=0){
            day++;
        }
        System.out.printf("%d",day);
    }
}
