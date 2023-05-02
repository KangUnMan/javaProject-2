package org.techit.Programmas;

import java.util.Arrays;

public class lastElement {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        solution5.solution(new int[]{2, 1, 6});


    }
}

class Solution5 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];;
        for (int i = 0; i <=num_list.length; i++) {

            if (i == num_list.length) {
                if (num_list[i-2] < num_list[i-1]) {
                    answer[i] = num_list[i-1] - num_list[i - 2];
                } else {
                    answer[i] = num_list[i-1] * 2;
                }
            }else{
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}
