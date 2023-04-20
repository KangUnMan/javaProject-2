package org.techit.week1;

import java.util.Scanner;

public class ScannerEx {
    public void plusNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요. 입력하고 엔터 입력하고 엔터");
        System.out.print("첫번째숫자:");
        System.out.println("첫번째 숫자는 "+sc.nextInt()+"입니다");
        System.out.print("두번째숫자:");
        System.out.println("두번째 숫자는 "+sc.nextInt()+"입니다");
    }
}
