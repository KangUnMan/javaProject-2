package org.techit.codeup;

import java.util.Scanner;

public class CodeUp91 {
    //91번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long al = sc.nextInt(); // 시작 값
        int mu = sc.nextInt(); // 곱할 값
        int pl = sc.nextInt(); // 더할 값
        int or = sc.nextInt(); // 순서

        for(int i=1; i<or; i++){
            al=al*mu+pl;
        }
        System.out.printf("%d",al);
    }
}
