package org.techit.codeup;

import java.util.Scanner;

public class CodeUp34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //입력을 String형으로 받아서 Integer로 8진수로 변환한다.
        String octalNumber = scan.nextLine();
        int dec = Integer.parseInt(octalNumber,8);
        System.out.printf("%d",dec);
    }
}