package org.techit.codeup;

import java.util.Scanner;

public class CodeUp76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //이렇게 처리하는게 일반적이라고 합니다.
        char alpaInput = sc.nextLine().charAt(0);
        char startAlp = 'a';
        do{
            System.out.printf("%c ",startAlp);
            startAlp++;
        } while (startAlp<=alpaInput);
    }
}
