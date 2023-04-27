package org.techit.week2.fourday;

public class IncreaseFirst2 {
    public static void main(String[] args) {
        int idx = 0;
        int[] numArr = {2, 1, 4 ,7};
        System.out.println(numArr[idx++]); // numArr 0번째 배열 출력 idx는 사용후 1증가
        System.out.println(numArr[idx++]); //numArr 1번째 배열 출력 idx는 사용후 1증가
        System.out.println(numArr[idx++]);
        System.out.println(numArr[idx]);
    }
}
