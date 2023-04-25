package org.techit.codeup;

import java.util.Scanner;

public class CodeUp20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String RRN = scan.nextLine();
        String[] RRNumber = RRN.split("\\-");
        int[] RRNchange = new int[RRNumber.length];;
        for (int i=0;i<RRNumber.length;i++){
            RRNchange[i]=Integer.parseInt(RRNumber[i]);
        }

        System.out.format("%06d%07d", RRNchange[0], RRNchange[1]);
    }
}
