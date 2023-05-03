package org.techit.Programmas;

public class CreateArray {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        if (solution7.solution(505)){
            System.out.printf("0 또는 5로 이루어진 숫자입니다.");
        }
    }
}

class Solution7 {
    public boolean solution(int num) {
        int[] answer = {};
        while (num > 0){
            int remainder = num%10;
            if(remainder % 5 != 0){
                return false;
            }
            num /=10;
        }
        return true;


    }
}