package org.techit.Programmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceQueries {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        solution6.solution(new int[] {0,1,2,4,3},new int[][] {{0, 4, 2},{0, 3, 2},{0, 2, 2}});

    }
}

class Solution6 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[3];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        int num;
        for(int i=0; i<queries.length; i++){
            num=1_000_001;
            for (int j=0; j<list.size(); j++){
                if(queries[i][0]<=list.get(j)){
                    if(queries[i][2]<list.get(j)&&num>list.get(j)){
                        num = list.get(j);
                    }
                }
            }
            if(num==1_000_001) num = -1;
            list.remove(Integer.valueOf(num));
            answer[i] = num;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
