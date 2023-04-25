package org.techit.codeup;

import java.util.Scanner;

public class CodeUp76 {
    //문제 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //이렇게 처리하는게 일반적이라고 합니다.
        char alpaInput = sc.nextLine().charAt(0);
        char startAlp = 'a';
        do{
            System.out.printf("%c ",startAlp);
            startAlp++;
        } while (startAlp<=alpaInput);
    }
}
