package org.techit.week2.lastday;

public class IfComparisonOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18;
        if(age>=18){
            System.out.printf("성인이고 나이는 %d세입니다.",age);
        }
        if(age<18){
            System.out.printf("성인이 아니며 나이는 %d세입니다.",age);
        }

    }
}
