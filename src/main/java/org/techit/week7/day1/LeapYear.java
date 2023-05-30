package org.techit.week7.day1;

public class LeapYear {
    //4로 나누어 떨어지는 것이 윤년 ex) 2020 , 2004
    // 100년마다는 4로 떨어져도 윤년이 아님 ex) 1700
    // 그런데 400년마다는 윤년이다. ex)1600
    public static void main(String[] args) {
        int year = 1700;
        if(checkLeapYear(year)){
            System.out.println("윤년입니다.");
        }else {
            System.out.println("윤년이 아닙니다.");
        }
    }

    public static boolean checkLeapYear(int year) {

        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

    }

    public static boolean isLeapYear(int year) {
        if(year % 400 ==0) return true;
        if(year % 100 ==0) return false;
        if(year % 4 == 0) return true;
        return false;
    }
}
