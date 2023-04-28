package org.techit.week2.lastday;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 1, 7 };
        boolean check;
        for (int i=0; i<arr.length; i++){
            if(i<3){
                check = arr[i] > arr [i+1];
            }else{
                check=false;
            }
            if(check){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
