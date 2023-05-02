package org.techit.codeup;

import java.util.Scanner;

public class CodeUp86 {
    public static void main(String[] args) {
        //86번
        Scanner sc = new Scanner(System.in);
        int pixel = sc.nextInt();
        int pixel2 = sc.nextInt();
        int bit = sc.nextInt();
        float save = (((float)pixel*pixel2*bit)/8)/1024/1024; // 계산 결과를 double 형으로 저장
        System.out.printf("%.2f MB",save);
    }
}
