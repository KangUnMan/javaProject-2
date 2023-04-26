package org.techit.week2;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillROw {
    public static void inputRowArr(int[][] arrRow , int row){
        for (int i=0; i<arrRow.length; i++){
            arrRow[row][i]=1;
        }
    }

    public static void printArray(int[][] arrRow ){
        for (int i=0; i<arrRow.length; i++){
            System.out.println(Arrays.toString(arrRow[i])); // 행 단위로 출력
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int row = scan.nextInt();
        inputRowArr(arr,row);
        printArray(arr);
    }

}
