package org.techit.week2;

import java.util.Arrays;

public class TwoDimArrSetValue {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[0]));
        }
        System.out.println();
        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
