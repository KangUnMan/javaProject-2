package org.techit.week5.day1;

import java.util.Arrays;

public class BubbleSort02 {

    public int[] sortARound(int[] arr,int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           sortARound(arr,i);
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort02 bubbleSort02 = new BubbleSort02();
        int[] arr = {7, 2, 3, 9, 28, 1};

        bubbleSort02.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
