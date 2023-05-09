package org.techit.week4.day2;

import java.util.Arrays;

public class SeparateToMethod {

    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {3, 4, 5},
                {4, 6, 7}
        };
        printArray(arr);
    }
}
