package org.techit.codeUp3week;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] maxArr = new int[9][9];
        int maxNum = 0;
        int row = 0; //열
        int line = 0; // 행
        for (int i=0; i<maxArr.length; i++){ // 수 입력
            String maxvalueStr = sc.nextLine();
            String[] maxvalueArr = maxvalueStr.split(" ");
            int[] denarray = new int[maxvalueArr.length];
            for(int j=0; j<maxvalueArr.length; j++){
                denarray[j] = Integer.parseInt(maxvalueArr[j]);
                maxArr[i][j] = denarray[j];
            }
        }


        for(int k=0; k<maxArr.length; k++){
            for(int m=0; m<maxArr.length; m++){
                if(maxNum<maxArr[k][m]){
                    maxNum = maxArr[k][m];
                    line = k;
                    row = m;
                }
            }
        }

        System.out.printf("\n%d\n%d %d",maxNum,line+1,row+1);



    }
}
