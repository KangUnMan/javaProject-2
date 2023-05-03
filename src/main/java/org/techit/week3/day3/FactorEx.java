package org.techit.week3.day3;

public class FactorEx {
    public static void main(String[] args) {
        //약수 구하기
        int num = 6;
        for (int i = 1; i <= num; i++){
            System.out.printf("%d %% %d --->%d\n", num , i , num % i);
        }
    }
}
