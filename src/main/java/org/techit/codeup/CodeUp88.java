package org.techit.codeup;

import java.util.Scanner;

public class CodeUp88 {
    //88번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decVar = sc.nextInt();
        for(int i = 1; i<=decVar; i++){
            if(i%3==0)
                continue; //컨티뉴는 그아래내용을 건너뛰고, 다음 반복을 수행한다.
            System.out.printf("%d ",i);
        }
    }
}
