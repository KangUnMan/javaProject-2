package org.techit.week5.day2;

import java.util.Arrays;

public class InsertSort {
    public int[] sortArr(int[] arr,boolean isAscending){
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j > 0; j--) {
                    System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                    if ((isAscending ? arr[j-1] - arr[j] : arr[j] - arr[j-1] )>0) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }

        return arr;
    }

    public int[] sortArr(int[] arr){
        sortArr(arr,true);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        // i j j-1
        // 1 1 0
        // 2 2 1
        // 3 3 2
        // 3 2 1
        // 3 1 0
        InsertSort insertSort = new InsertSort();
        insertSort.sortArr(arr,false);
        System.out.println(Arrays.toString(arr));
    }
    //어떻게하면 계산을 줄일수있을까? 교환이 안될때는 브레이크를 하자.

}
