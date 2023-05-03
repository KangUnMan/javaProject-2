package org.techit.codeUp3week;

import java.util.Scanner;

public class CodeUp1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.printf("%d ",i);
            }
        }
    }
}
