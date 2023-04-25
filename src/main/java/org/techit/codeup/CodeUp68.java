package org.techit.codeup;

import java.util.Scanner;

public class CodeUp68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade>=90){
            System.out.printf("A");
        }else if(grade>=70 && grade<=89){
            System.out.printf("B");
        }else if(grade>=40 && grade<=69){
            System.out.printf("C");
        }else{
            System.out.printf("D");
        }
    }
}
