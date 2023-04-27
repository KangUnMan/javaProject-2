package org.techit.week2.fourday;

public class OrExample {
    public static void main(String[] args) {
        int yearOfExp = 8;
        int numOfProk = 12;

        boolean isPromotion = yearOfExp < 5 || numOfProk > 10 ;
        System.out.printf("팀장 승진 여부: %b",isPromotion);
    }
}
