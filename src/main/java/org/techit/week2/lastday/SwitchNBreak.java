package org.techit.week2.lastday;

public class SwitchNBreak {
    public static void main(String[] args) {
        int dayOfWeek = 4;

        switch (dayOfWeek){
            case 1:
                System.out.println("월요일");
            case 2:
                System.out.println("화요일");
            case 3:
                System.out.println("수요일");
            case 4:
                System.out.println("목요일");
            case 5:
                System.out.println("금요일");
            case 6:
                System.out.println("토요일");
            case 7:
                System.out.println("일요일");
            default:
                System.out.println("해당하는 요일이 없습니다");
        }

        // break; 문을 안쓸시 해당하는 case부터 다 실행된다.
        //목요일
        //금요일
        //토요일
        //일요일
        //해당하는 요일이 없습니다.
    }
}
