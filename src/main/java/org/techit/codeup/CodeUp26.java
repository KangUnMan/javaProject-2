package org.techit.codeup;

import java.util.Scanner;

public class CodeUp26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String timeInput = scan.nextLine();
        String[] timeStr = timeInput.split(":");
        int time[] = new int[timeStr.length];
        for(int i=0; i<timeStr.length; i++){
            time[i] = Integer.parseInt(timeStr[i]);
        }

        System.out.printf("%d",time[1]);


    }
}