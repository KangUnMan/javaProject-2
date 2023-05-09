package org.techit.week4.day2;

import java.util.Arrays;

public class CodeUp98 {
    private int[][]arr;
    public CodeUp98(int hei, int wide) { //생성자
        this.hei = hei;
        this.wide = wide;
        arr = new int[hei][wide];
    }

    private  int hei; //높이
    private  int wide; // 길이

    public void printArray(){  // 프린트 메소드
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public void insertStick(int l, int d, int x, int y){ // 막대기 놓기
            for (int j=0; j<l; j++) {
                if (d == 0) // 가로
                    arr[x-1][y-1+j] = 1;
                else
                    arr[x-1+j][y-1] = 1;
            }
    }


    public static void main(String[] args) {
        CodeUp98 codeUp98 = new CodeUp98(5,5);
        codeUp98.insertStick(2,0,1,1);
        codeUp98.insertStick(3,1,2,3);
        codeUp98.insertStick(4,1,2,5);
        codeUp98.printArray();
    }
}
