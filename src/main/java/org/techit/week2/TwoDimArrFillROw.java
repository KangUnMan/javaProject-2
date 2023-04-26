package org.techit.week2;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillROw {
    public static void inputRowArr(int[][] arrRow){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        for (int i=0; i<arrRow.length; i++){
            arrRow[row][i]=1;
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        inputRowArr(arr);
        System.out.println(Arrays.toString(arr[0])); // 행 단위로 출력
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[0]));
    }

}
