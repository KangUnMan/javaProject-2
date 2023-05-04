package org.techit.week3.day4;

public class P120852B {
    public static void main(String[] args) {
        int n = 120;
        int divisor = 2;
        int[] arr = new int[n + 1];
        while (n > 1) {
            if (n % divisor == 0) {
                arr[divisor] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }
        int size = 0;
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                size++;
            }
        }
        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < answer.length; i++) System.out.printf("%d ", answer[i]);
    }
}
