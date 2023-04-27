package org.techit.week2.fourday;

public class trueFalseCheck {
    public static void main(String[] args) {
        boolean result = true&&true;
        System.out.printf("true&&true == %b\n",result);
        result = false&&true;
        System.out.printf("false&&true == %b\n",result);
        result = false&&false;
        System.out.printf("false&&false == %b\n",result);
    }
}
