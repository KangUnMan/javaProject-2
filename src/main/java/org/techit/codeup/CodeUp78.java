package org.techit.codeup;

import java.util.Scanner;

public class CodeUp78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plusNum = sc.nextInt();
        int sum=0;
        for (int i=0; i<=plusNum; i++){
            if(i%2==0){
                sum +=i;
            }
        }
        System.out.printf("%d",sum);
    }
}
