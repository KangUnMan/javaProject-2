package org.techit.codeup;

import java.util.Scanner;

public class CodeUp64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int greaterThanNum1 = sc.nextInt();
        int greaterThanNum2 = sc.nextInt();
        int greaterThanNum3 = sc.nextInt();
//
        System.out.printf("%d", (greaterThanNum1 < greaterThanNum2 ? greaterThanNum1 : greaterThanNum2) < greaterThanNum3 ?
                (greaterThanNum1 < greaterThanNum2 ? greaterThanNum1 : greaterThanNum2) : greaterThanNum3);
        // 변수 1과 2를 비교하여 변수 1이 2보다 작으면 1반환 아니면 2반환 그둘보다 3이 작으면 3반환
        // 변수1보다 2가 작으면 2반환 같을시? 3반환인듯함
    }
}