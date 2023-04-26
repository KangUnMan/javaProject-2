package org.techit.codeup;

import java.util.Scanner;

public class CodeUp85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hz = sc.nextInt(); // 소리
        int bit = sc.nextInt(); // 비트
        int ch = sc.nextInt(); // 채널
        int se = sc.nextInt(); // 녹음할 시간
        float save = (((float)hz*bit*ch*se)/8)/1024/1024; // 계산 결과를 double 형으로 저장
        System.out.printf("%.1f MB",save);
    }
}
