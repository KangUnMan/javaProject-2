package org.techit.week3.day4;

import java.util.Scanner;

public class CodeUp94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int call = sc.nextInt();
        int[] student = new int[call];
        for(int i = 0; i<student.length; i++){
            int number = sc.nextInt();
            student[i] = number;
        }

        for (int j = call-1; j>=0; j--){
            System.out.printf("%d ",student[j]);
        }
    }
}
