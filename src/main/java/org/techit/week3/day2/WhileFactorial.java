package org.techit.week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        // 5! = 120
        int n = 5;
        int answer = 1;
        while (n > 0){
            answer *= n;
            n--;
        }
        System.out.println(answer);
    }
}
