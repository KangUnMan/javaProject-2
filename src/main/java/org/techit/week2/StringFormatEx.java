package org.techit.week2;

public class StringFormatEx {
    public static void main(String[] args) {
        String name = "김경록";
        int balance = 10000;
        String message = name + "님의 통장 잔고는 " + balance + "원입니다.";
        System.out.println(message);


        String.format("%d아메리카노",balance);
    }

}
