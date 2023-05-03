package org.techit.week3.day3;

import java.util.Scanner;

public class IsPrimeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int factors = 0;
        for(int i =2; i * i <= num; i++){
            if(num%i==0){
                factors++;
            }
        }
        System.out.printf("%s",factors==0 ? "prime":"not prime" );
    }
}
