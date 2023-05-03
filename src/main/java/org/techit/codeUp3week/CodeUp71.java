package org.techit.codeUp3week;

import java.util.Scanner;

public class CodeUp71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            if(num==0){
                break;
            }
            System.out.println(num);

        }while (num !=0);
    }
}
