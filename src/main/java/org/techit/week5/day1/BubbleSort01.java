package org.techit.week5.day1;

import java.util.Arrays;
import java.util.Comparator;


public class BubbleSort01 {

    Comparator comparator;
    public int[] sortARound(int[] arr, int idx) {
        for (int i = 0; i < arr.length - idx; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int j = 1; j <= arr.length - 1; j++) {
            arr = sortARound(arr, j);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort01 bubbleSort01 = new BubbleSort01();
        int[] arr = {7, 2, 3, 9, 28, 1};
        bubbleSort01.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
