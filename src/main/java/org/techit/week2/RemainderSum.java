package org.techit.week2;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int firstRemainder = num % 10;
        num = num /10;
        int secondRemainder = num % 10;
        num = num /10;
        int thridRemainder = num % 10;
        System.out.printf("%d",firstRemainder+secondRemainder+thridRemainder);

    }
}
