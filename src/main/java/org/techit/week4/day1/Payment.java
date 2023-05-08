package org.techit.week4.day1;

public class Payment {
    public static void main(String[] args) {
        Accout accout = new Accout();
        boolean isSufficient = accout.isSufficient();
        if(isSufficient){
            System.out.println("결제를 요청합니다.");
        }else{
            System.out.println("잔액이 부족합니다.");
        }
    }
}
