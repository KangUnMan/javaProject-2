package org.techit.codeup;
import java.util.Scanner;
public class CodeUp19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ymd = scan.nextLine();
        String[] yearMonthDay = ymd.split("\\.");
        int[] yearMon = new int[yearMonthDay.length];;
        for (int i=0;i<yearMonthDay.length;i++){
            yearMon[i]=Integer.parseInt(yearMonthDay[i]);
        }

        System.out.format("%04d.%02d.%02d",yearMon[0],yearMon[1],yearMon[2]);
    }
}
