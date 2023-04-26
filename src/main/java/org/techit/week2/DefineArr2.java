package org.techit.week2;

import java.util.Arrays;

public class DefineArr2 {
    public static void main(String[] args) {
        int[] iArr = new int[]{1, 2, 3, 8};
        int[][] i2Arr = {
                {10, 20, 30},
                {20, 30, 40},
                {50, 60, 80}
        };
        System.out.println(Arrays.toString(i2Arr[0]));
        System.out.println(Arrays.toString(i2Arr[1]));
        System.out.println(Arrays.toString(i2Arr[2]));
    }
}
