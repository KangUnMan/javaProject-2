package org.techit.codeup;

import java.util.Scanner;

public class CodeUp81 {
    public static void main(String[] args) {
        //서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력.
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
