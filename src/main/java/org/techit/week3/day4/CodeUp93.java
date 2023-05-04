package org.techit.week3.day4;

import java.util.Scanner;

public class CodeUp93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] student = new int[24];

        int studentCall = sc.nextInt();

        for(int i=1; i<studentCall; i++){
            int num = sc.nextInt();
            student[num]+=1;
        }

        for(int i=1; i<student.length; i++){
            System.out.printf("%d ",student[i]);
        }
    }
}
