package org.techit.week3.day1;

public class SwitchCaseHospital {
    public static void main(String[] args) {
        String day ="월";
        String time = switch (day){
          case "월","화","수","목","금" -> "09:30 - 18:30";
            case "토" -> "09:30-13:00";
            case "일" ->"휴진";
            default -> throw new IllegalArgumentException("존재하지않는 요일입니다:" +
                    day);
        };
        System.out.printf("%s",time);
    }
}
