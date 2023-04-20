package org.techit.codeup;

import java.util.Scanner;

public class CodeUp25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fiveNum = scan.nextLine();
        char[] fiveArray = new char[5];
        fiveArray = fiveNum.toCharArray();
        int[] fiveNumArray = new int[fiveArray.length];
        for(int i=0; i<fiveArray.length; i++){
            //Character.getNumericValue() 메소드는 주어진 문자의 숫자값을 반환하는 메소드
            fiveNumArray[i]= Character.getNumericValue(fiveArray[i]);
        }
        System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]",fiveNumArray[0]*10000,fiveNumArray[1]*1000,fiveNumArray[2]*100,fiveNumArray[3]*10,fiveNumArray[4]);

    }
}
