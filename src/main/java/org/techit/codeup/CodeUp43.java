package org.techit.codeup;

import java.util.Scanner;

public class CodeUp43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //스캐너 객체 생성
        int val = scan.nextInt();
        int val2 = scan.nextInt();
        System.out.printf("%d",val%val2);
       /* String PlusNum = scan.nextLine(); // 입력값을 받을 스트링 변수 생성
        String[] PlusNumChange; // 변수를 나눠줄 배열 생성
        PlusNumChange =PlusNum.split(" ");// 공백을 기준으로 나누기
        int[] val = new int[PlusNumChange.length];
        for(int i=0; i<PlusNumChange.length; i++){ //각 입력받은 숫자들을 부호에 따라 val,val2에 저장
            if(PlusNumChange[i].substring(0)=="-"){
                val[i] = Integer.parseInt(PlusNumChange[i]);
                val[i] = -val[i];
            }else{
                val[i] = Integer.parseInt(PlusNumChange[i]);
            }
        }
        System.out.printf("%d",val[0]%val[1]);
        */
    }
}