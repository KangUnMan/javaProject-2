package org.techit.codeup;

import java.util.Scanner;

public class CodeUp55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //자바에서도 입력을 받을때 공백으로 받으면 ex)1 3 ) a가 1을 받고 b가 3을 받을 수 있다는 사실을 지금 알았다..
        int allTrueCheckVar1 = scan.nextInt();
        int allTrueCheckVar2 = scan.nextInt();

        boolean allTrueCheckbool = allTrueCheckVar1 ==1 || allTrueCheckVar2 == 1;

        System.out.printf("%d",allTrueCheckbool ? 1 : 0);


    }
}
