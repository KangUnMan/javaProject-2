package org.techit.week2.fourday;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >= 18;
        System.out.printf("미성년자입니까? : ",!isAdult);
    }
}
