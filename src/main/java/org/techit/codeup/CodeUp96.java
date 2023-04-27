package org.techit.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] badukpan = new int[20][20]; // 바둑판 크키
        int reqeatCount = sc.nextInt();  //

        for(int i=0; i<reqeatCount; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(badukpan[x][y]==0){
                badukpan[x][y]++;
            }
        }

        for(int i=1; i<=19; i++){ //바둑판 출력
            for (int j=1; j<=19; j++){
                System.out.printf("%d ",badukpan[i][j]);
            }
            System.out.println();
        }

    }
}
