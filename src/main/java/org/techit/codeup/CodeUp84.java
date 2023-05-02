package org.techit.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp84 { // 시간초과로인한 코드배낌..

    public static void main(String[] args) throws IOException {
        //84번
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 버퍼링하여 출력 성능을 향상시킨다.
        for(int i=0; i<r; i++) {
            for(int j=0; j<g; j++) {
                String str=""; // 빈 문자열 선언 * 반복문을 돌때마도 초기화해야함.
                for(int k=0; k<b;k++) {
                    str += i+" "+j+" "+k+"\n";
                }
                bf.write(str);
                bf.flush();
            }
        }
        System.out.println(r*g*b);
    }
}
