package org.techit.codeup;

import java.util.Scanner;

public class CodeUp48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bitCalNumStr = sc.nextLine();
        String[] bitCalNumStrArr = bitCalNumStr.split(" "); //공백으로 나눈다.
        int[] bitCalNumArr = new int[bitCalNumStrArr.length];
        for(int i=0; i<bitCalNumStrArr.length; i++){
            bitCalNumArr[i] = Integer.parseInt(bitCalNumStrArr[i]);
        }
        System.out.printf("%d",bitCalNumArr[0]<<bitCalNumArr[1]);
    }
}
