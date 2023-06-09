package org.techit.week4.day1;

public class MutsaMath {

    public int sumOfFactors(int num) {
        // 약수들의 합을 리턴하는 메소드
        int answer = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
    void printResult(int num){
        System.out.printf("%d의 약수의 합은 %d입니다.\n",num,sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
        mutsaMath.printResult(12);
        mutsaMath.printResult(48);
        mutsaMath.printResult(32);
        mutsaMath.printResult(29);


    }
}
