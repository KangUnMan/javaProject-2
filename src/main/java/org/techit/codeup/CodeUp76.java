package org.techit.codeup;

import java.util.Scanner;

public class CodeUp76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //76번
        char alpaInput = sc.nextLine().charAt(0);
        char startAlp = 'a';
        do{
            System.out.printf("%c ",startAlp);
            startAlp++;
        } while (startAlp<=alpaInput);
    }
}
