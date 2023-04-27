package org.techit.codeup;

import java.util.Scanner;

public class CodeUp60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bitWise = sc.nextInt();
        int bitWise2 = sc.nextInt();
        System.out.printf("%d",bitWise&bitWise2); // &는 and 연산자라 두개가 일치하는 것만 골라낸다 ex) 3 ,5 가 입력되었다면
        //3       : 00000000 00000000 00000000 00000011
        //5       : 00000000 00000000 00000000 00000101
        //3 & 5 : 00000000 00000000 00000000 00000001
        // 이런식으로 겹치는 1만 남아 10진수로 변환되어 1이 출력된다.
        //비트 단위 연산자 종류** 비트단위(bitwise)연산자는,
        //~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
        //<<(bitwise left shift), >>(bitwise right shift)가 있다.
    }
}
