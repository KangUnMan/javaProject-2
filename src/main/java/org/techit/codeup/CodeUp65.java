package org.techit.codeup;

import java.util.Scanner;

public class CodeUp65 {
    public static void main(String[] args) {
        //홀짝수
        Scanner sc = new Scanner(System.in);
        int numEven1 = sc.nextInt();
        int numEven2 = sc.nextInt();
        int numEven3 = sc.nextInt();
        if(numEven1%2==0){
            System.out.printf("%d\n",numEven1);
        }
        if(numEven2%2==0){
            System.out.printf("%d\n",numEven2);
        }
        if(numEven3%2==0){
            System.out.printf("%d\n",numEven3);
        }

    }
}
