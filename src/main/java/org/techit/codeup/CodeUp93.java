package org.techit.codeup;

import java.util.Scanner;

public class CodeUp93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[23]; // 출석번호 배열
        int randomTry = sc.nextInt(); // 출석번호를 무작위로 부르는 횟수.
        for(int i=0; i<randomTry; i++){
            int number = sc.nextInt();
            student[number-1]++; //배열은 0부터 시작이니 입력받은 출석번호에서 -1을 해준다.
        }
        for (int i=0; i<student.length; i++){
            System.out.printf("%d ",student[i]);
        }
    }
}
