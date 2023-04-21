package org.techit.week1;

public class MemberVar {
    //전역변수에 경우 생성할시 초기값을 가지기때문에 초기화를 안해도 오류가 나지않음 하지만 로컬변수(지역변수)같은 경우는 아직 공간만 난 경우기때문에 초기화를 해주어야한다.
    int location;
    private void moveLeft() {
        location -= 1; // 변수 사라짐

    }
    private void moveRight() {
        location += 1; // 변수 사라짐

    }

    public static void main(String[] args) {
        MemberVar si = new MemberVar();

        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveLeft();
        si.moveLeft();
        si.moveLeft();
        si.moveLeft();
        si.moveLeft();
        System.out.printf("최종 위치 : %d",si.location);

    }
}

