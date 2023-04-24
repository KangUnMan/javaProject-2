package org.techit.week2;

public class StringIntPlus {
    public static void main(String[] args) {
        String num1 = "1";
        int num2=1;
        System.out.println(num1+num2);
        System.out.println(num2+num1);

        int iResult = 1+Integer.parseInt(num1);
        System.out.println(iResult);

        /*String FormatExceptionNum = "123abc";
        int intNumber = Integer.parseInt(FormatExceptionNum); */
    }
}
