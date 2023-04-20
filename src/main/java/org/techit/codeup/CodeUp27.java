package org.techit.codeup;

import java.util.Scanner;

public class CodeUp27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yearInput = scan.nextLine();
        String[] yearStr = yearInput.split("\\.");
        int[] ymd = new int[yearStr.length];
        for(int i=0; i<yearStr.length; i++){
            ymd[i] = Integer.parseInt(yearStr[i]);
        }

        System.out.printf("%02d-%02d-%d",ymd[2],ymd[1],ymd[0]);

    }
}
