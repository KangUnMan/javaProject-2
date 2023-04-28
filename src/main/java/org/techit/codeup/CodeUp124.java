package org.techit.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mole = sc.next();
        String var = mole.replace("C","12.").replace("H",".1.");
        String[] varArr = var.split("\\.");
        int[] varIntArr = new int[varArr.length];
        for (int i=0; i<varArr.length; i++){
            varIntArr[i] = Integer.parseInt(varArr[i]);
        }
        System.out.printf("%d",varIntArr[0]*varIntArr[1]+varIntArr[2]*varIntArr[3]);
    }
}
