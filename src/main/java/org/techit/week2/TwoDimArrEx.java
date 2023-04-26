package org.techit.week2;

import java.util.Arrays;

public class TwoDimArrEx {
    public static void printArray(int[][] arr) { //출력 메소드? 정보를 넘기면 그 정보로 출력해준다는것일듯함
        for (int i=0; i<arr.length; i++){ //배열길이때라 달라지게. .length는 첫번째 차원의 길이를 반환하기 때문에
            // 크기인 9가아니라 3이 나온다.
            System.out.println(Arrays.toString(arr[i])); // 반복문을 실행할때마다 달라지게 i를 넣는다.
        }
        System.out.println("_____________");
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArray(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;

        printArray(arr);

        arr[1][1]=5;
        printArray(arr);
    }
}
