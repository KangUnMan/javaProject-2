package org.techit.week3.day3;

import java.util.Scanner;

public class SumofOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (int i=1; i<=num; i++ ){
            if(num%2==0){
                result += i;
            }
        }
        System.out.printf("%d",result);
    }
}
