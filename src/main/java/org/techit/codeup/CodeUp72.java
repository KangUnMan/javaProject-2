package org.techit.codeup;

import java.util.Scanner;

public class CodeUp72 {
    public static void main(String[] args) {
        // 72번 goto문이 뭘까
        Scanner sc = new Scanner(System.in);
        int selectNum = sc.nextInt();
        sc.nextLine();
        String printNumStr = sc.nextLine();
        String[] printNumStrArr = printNumStr.split(" ");
        int printNum;
        for (int i=0; i<selectNum; i++){
            printNum = Integer.parseInt(printNumStrArr[i]);
            System.out.printf("%d\n",printNum);
        }

    }
}
