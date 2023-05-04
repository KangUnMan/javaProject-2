package org.techit.week3.day4;

import java.util.Arrays;

public class Queries3 {
    public static void main(String[] args) {

    }
}

// 배열 덮어쓴다는 느낌으로 가자.
class Solution2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        int changeNum = 0;
        for(int i=0; i<queries.length; i++){
            changeNum = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = changeNum;
        }

        return answer;
    }
}