package org.techit.codeUp3week;

import java.util.Scanner;

public class CodeUp96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] badukpan = new int[20][20];
        int badukR = 5;

        for(int i = 0; i<badukR; i++){
            int c = sc.nextInt();
            int r = sc.nextInt();
            if(badukpan[c][r]!=1)badukpan[c][r]++;
        }

        for(int j=1; j<badukpan.length; j++){
            for(int k=1; k<badukpan.length; k++){
                System.out.printf("%d ",badukpan[j][k]);
            }
            System.out.println();
        }


    }
}
