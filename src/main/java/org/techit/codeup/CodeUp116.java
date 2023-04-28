package org.techit.codeup;

import java.util.Scanner;

public class CodeUp116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calNum1 = sc.nextInt();
        int calNum2 = sc.nextInt();

        System.out.printf("%d+%d=%d\n",calNum1,calNum2,calNum1+calNum2);
        System.out.printf("%d-%d=%d\n",calNum1,calNum2,calNum1-calNum2);
        System.out.printf("%d*%d=%d\n",calNum1,calNum2,calNum1*calNum2);
        System.out.printf("%d/%d=%d\n",calNum1,calNum2,calNum1/calNum2);
    }
}
