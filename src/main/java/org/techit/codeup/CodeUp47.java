package org.techit.codeup;

import java.util.Scanner;

public class CodeUp47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bitCalVar = sc.nextInt();
        //비트연산자 printf("%d", a<<1); //10을 2배 한 값인 20 이 출력된다.
        //printf("%d", a>>1); //10을 반으로 나눈 값인 5 가 출력된다
        //printf("%d", a<<2); //10을 4배 한 값인 40 이 출력된다.
        //printf("%d", a>>2); //10을 반으로 나눈 후 다시 반으로 나눈 값인 2 가 출력된다.
        System.out.printf("%d", bitCalVar<<1); //입력한 값의 2배한 값이 출력된다.

    }
}
