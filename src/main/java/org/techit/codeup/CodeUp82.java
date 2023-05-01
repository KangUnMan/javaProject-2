package org.techit.codeup;

import java.util.Scanner;

public class CodeUp82 {
    public static void main(String[] args) {
        //16진수 구구단
        Scanner sc = new Scanner(System.in);
        String hexNumStr = sc.nextLine();
        int hexNum = Integer.parseInt(hexNumStr , 16); //16진수나 8진수나 2진수나 변환할때 이걸쓰자.
        for(int i=1; i<16; i++){
            //대문자는 %H , 소문자 %h
            System.out.printf("%H*%H=%H\n",hexNum,i,hexNum*i); //16진수를 출력할때는 souf를 애용하도록하자.
        }
    }
}
