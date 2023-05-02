package org.techit.codeup;

import java.util.Scanner;

public class CodeUp83 {
    public static void main(String[] args) {
        // 3 ,6 ,9 게임
        Scanner sc = new Scanner(System.in);
        int threeSixNine = sc.nextInt();
        for(int i=1; i<=threeSixNine; i++){
            if(i%3==0){
                System.out.printf("X ");
            }else{
                System.out.printf("%d ",i);
            }
        }
    }
}
