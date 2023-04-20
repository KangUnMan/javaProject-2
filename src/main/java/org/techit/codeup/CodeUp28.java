package org.techit.codeup;

import java.util.Scanner;

public class CodeUp28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //자바에서는 부호없는 정수형 변수형을 사용하지 못함 long타입 써야한다.
        long val = scan.nextLong();
        
        System.out.println(val);
    }
}
