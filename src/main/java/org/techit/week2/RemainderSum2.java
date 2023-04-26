package org.techit.week2;

public class RemainderSum2 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        answer = answer + num % 10;
        num = num / 10;
        System.out.printf("answer: %d\n",answer);

        answer = answer + num % 10;
        num = num / 10;
        System.out.printf("answer: %d\n",answer);

        answer = answer + num % 10;
        System.out.printf("answer: %d\n",answer);
    }
}
