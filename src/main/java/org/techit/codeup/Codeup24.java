package org.techit.codeup;


import java.util.Scanner;

public class Codeup24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner scan 객체 생성
        String input = scan.nextLine();  // 입력값을 문자열로 받음
        char[] charArray = new char[20];
        charArray = input.toCharArray();  // 입력값을 char 배열로 변환

        for (char c : charArray) {
            System.out.printf("'%s'", c);
            System.out.println();
        }
    }
}
