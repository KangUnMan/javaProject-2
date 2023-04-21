package org.techit.codeup;

import java.util.Scanner;

public class CodeUp59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bitWise = sc.nextInt();

        System.out.printf("%d",~bitWise); // ~ 연산자라서 2의 2진수표현인 0000 0010를 거꾸로 바꿔서 1111 1101이 되어 -3이된다. 2진수에 대해 공부해봐야할듯
    }
}
