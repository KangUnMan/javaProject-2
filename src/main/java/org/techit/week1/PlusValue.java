package org.techit.week1;

import java.util.Scanner;

public class PlusValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int val1,val2;
        System.out.println("첫번째 숫자를 입력해주세요");
        val1 = scan.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        val2 = scan.nextInt();

        System.out.printf("%d와 %d의 합은 %d입니다.", val1,val2,val1+val2);
    }
}
