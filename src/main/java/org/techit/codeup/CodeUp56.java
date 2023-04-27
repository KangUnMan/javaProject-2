package org.techit.codeup;

import java.util.Scanner;

public class CodeUp56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allTrueCheckVar1 = scan.nextInt();
        int allTrueCheckVar2 = scan.nextInt();

        boolean allTrueCheckbool = allTrueCheckVar1 != allTrueCheckVar2; // 두개가 서로 같지 않을 경우

        System.out.printf("%d",allTrueCheckbool ? 1 : 0);


    }
}
