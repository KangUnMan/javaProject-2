package org.techit.codeup;

import java.util.Scanner;

public class CodeUp55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allTrueCheckVar1 = scan.nextInt();
        int allTrueCheckVar2 = scan.nextInt();

        boolean allTrueCheckbool = allTrueCheckVar1 == 1 || allTrueCheckVar2 == 1;

        System.out.printf("%d",allTrueCheckbool ? 1 : 0);


    }
}
