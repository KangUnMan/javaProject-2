package org.techit.codeup;

import java.util.Scanner;

public class CodeUp98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
        //두 번째 줄에 놓을 수 있는 막대의 개수(n)
        //세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
        int wide = sc.nextInt(); // 판의 넓이
        int hei = sc.nextInt(); // 판의 높이
        int[][]pan = new int[hei][wide]; //판 크기
        int stick = sc.nextInt(); // 막대의 개수

        for(int i=0; i<stick; i++){ // 막대의 개수 만큼 반복.
            int leng = sc.nextInt(); // 막대의 길이
            int dir =  sc.nextInt(); // 막대의 방향 0이면 가로 1이면 세로
           // if()
        }

    }
}
