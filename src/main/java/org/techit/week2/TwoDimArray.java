package org.techit.week2;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // 2차원 배열 선언
        int[] arr0 = arr[0]; // 2차원 배열에서 배열을 꺼내 1차원 배열이 됨
        arr0[0] = 1; // 1차원 배열인 arr0에서 첫번째 칸에 값을 할당
        //                {1, 0, 0},  첫번째 줄까지는 1차원개념
        //                {0, 0, 0},  두번째줄부터 2차원적으로 생각해야할듯 2번째줄은 2차원배열으로만 찾을수있다.
        //                {0, 0, 0}
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}