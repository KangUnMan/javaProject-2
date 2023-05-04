package org.techit.week3.day4;

import java.util.Arrays;

public class Queries3Ex2 {
}

class Solution4 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        int changeNum = 0;
        for(int i=0; i<queries.length; i++){
            changeNum = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = changeNum;
        }

        return answer;
    }
}