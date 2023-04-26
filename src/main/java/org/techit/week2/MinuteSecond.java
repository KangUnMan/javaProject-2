package org.techit.week2;

public class MinuteSecond {


    public static void main(String[] args) {
        int seconds = 239; //초
        int minute = seconds / 60; //분 구하기
        int remainSeconds = seconds % 60; // 분 구하고 남는초
        System.out.printf("%d분 %d초",minute, remainSeconds); //출력
    }
}
