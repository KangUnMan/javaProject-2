package org.techit.codeup;

import java.util.Scanner;

public class CodeUp81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diceNum1 = sc.nextInt();
        int diceNum2 = sc.nextInt();
        for(int i=1; i<=diceNum1; i++){
            for (int j=1; j<=diceNum2; j++){
                System.out.printf("%d %d\n",i,j);
            }
        }
    }
}
