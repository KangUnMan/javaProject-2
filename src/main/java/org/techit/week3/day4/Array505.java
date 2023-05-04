package org.techit.week3.day4;

public class Array505 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5,555);
    }
}

class Solution {

    public boolean fiveOrZero(int num){
        while (num>0){
            int reminder = num%10;
            if(reminder%5!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }

    public int[] solution(int l, int r) {
        int size = 0;
        int idx = 0;
        int[] result = new int[r+1];
        for(int i=l; i<=r; i++){
            if(fiveOrZero(i)){
                size++; //배열 크기 정하기
                result[i]=i;
            }
        }
        if(size==0){
            result[0] = -1;
            size++;
        }
        int[] answer = new int[size];

        for(int j=0; j<result.length; j++){
            if(result[j]!=0){
                answer[idx++] = result[j];
            }
        }

        return answer;
    }
}