package org.techit.codeup;

import java.util.Scanner;

public class CodeUp87 {
    //87번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();
        int sum=0;

        for(int i=1; sum<decNum; i++){
            sum+=i;
        }
        System.out.printf("%d",sum);
    }
}
