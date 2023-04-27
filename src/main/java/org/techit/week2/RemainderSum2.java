package org.techit.week2;

public class RemainderSum2 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        //무조건 나머지를 먼저 구하고 나누기를 해야함.
        answer = answer + num % 10;
        num = num / 10;
        System.out.printf("answer: %d\n",answer);
        //7
        answer = answer + num % 10;
        num = num / 10;
        System.out.printf("answer: %d\n",answer);
        //15
        answer = answer + num % 10;
        System.out.printf("answer: %d\n",answer);
        //21
    }
}
