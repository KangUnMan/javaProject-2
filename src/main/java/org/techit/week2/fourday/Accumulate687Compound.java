package org.techit.week2.fourday;

public class Accumulate687Compound {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        answer += num%10; //7
        num = num/10; // 68
        answer += num%10; // 8
        num = num/10; // 6
        answer += num%10; //6
        // 7 + 8 + 6 = 21
        System.out.printf("%d",answer);
    }
}
