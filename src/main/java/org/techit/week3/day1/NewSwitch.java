package org.techit.week3.day1;

public class NewSwitch {
    public static void main(String[] args) {
        int hour = 3;
        int grade = switch (hour){
            case 1,2,3 -> 31;
            case 4,5,6 -> 30;
            case 7,8,9 -> 29;
            default -> throw new IllegalArgumentException("없는정보:" +
                    hour);
        };
    }
}
