package org.techit.codeup;

import java.util.Scanner;

public class CodeUp66 {
    public static void main(String[] args) {
        //홀짝수
        Scanner sc = new Scanner(System.in);
        int evenOrOddNum1 = sc.nextInt();
        int evenOrOddNum2 = sc.nextInt();
        int evenOrOddNum3 = sc.nextInt();
        
        if (evenOrOddNum1%2==0){
            System.out.printf("even\n");
        }else {
            System.out.printf("odd\n");
        }
        if (evenOrOddNum2%2==0){
            System.out.printf("even\n");
        }else {
            System.out.printf("odd\n");
        }
        if (evenOrOddNum3%2==0){
            System.out.printf("even\n");
        }else {
            System.out.printf("odd\n");
        }

    }
}
