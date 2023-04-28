package org.techit.week2.lastday;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int numOfProject =sc.nextInt();

        if(year>5 || numOfProject>10){
            System.out.println("팀장 승인 대상입니다.");
        }else {
            System.out.println("팀장 승인 대상이 아닙니다.");
        }

    }
}
