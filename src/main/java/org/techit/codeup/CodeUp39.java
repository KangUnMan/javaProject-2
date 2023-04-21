package org.techit.codeup;

import java.util.Scanner;
//부호가 안받아짐
public class CodeUp39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //스캐너 객체 생성
        String PlusNum = scan.nextLine(); // 입력값을 받을 스트링 변수 생성
        String[] PlusNumChange; // 변수를 나눠줄 배열 생성
        PlusNumChange =PlusNum.split(" ");// 공백을 기준으로 나누기
        long[] val = new long[PlusNumChange.length];
        for(int i=0; i<PlusNumChange.length; i++){ //각 입력받은 숫자들을 부호에 따라 val,val2에 저장
            if(PlusNumChange[i].substring(0)=="-"){
                val[i] = Long.parseLong(PlusNumChange[i]); //입력받는  수가 넘어갈수있기때문에
                val[i] = -val[i];
            }else{
                val[i] = Long.parseLong(PlusNumChange[i]);
            }
        }
        System.out.printf("%d",val[0]+val[1]); // 자바에서는 long 타입도 %d로 받아야한다.

    }
}