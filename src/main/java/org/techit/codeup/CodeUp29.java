package org.techit.codeup;

import java.util.Scanner;

public class CodeUp29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //float형은 7자리까지 나타낼수있기때문에 3.14159265359를 나타내지못해 double형을 써야함
        double val = scan.nextDouble();

        System.out.printf("%.11f",val);
    }
}
