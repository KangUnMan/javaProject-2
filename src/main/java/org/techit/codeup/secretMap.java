package org.techit.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class secretMap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //지도 한변의 크기
        int[] arr1 = new int[n]; //지도 1
        int[] arr2 = new int[n]; //지도 2

        for(int i=0; i<n; i++){
            arr1[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++){
            arr2[i] = scan.nextInt();
        }

        for (int i=0; i<n; i++){
            String binaryString = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i]|arr2[i])));
            binaryString = binaryString.replace('1', '#').replace('0', ' ');
            if(i==0){
                System.out.printf("");
            }
            System.out.println(binaryString);
        }

    }
}
