package org.techit.week3.day4;

public class CreatArray3 {
    // 특정구간만 모아서 떼서 새로운 배열을 만드는듯합니다.
    // 생각나는 방법 :
    // 배열의 길이는 : 일단 얼마만큼에 길이가 필요한지 구한다. 구간마다 size++;
    // 그리고 떼서 붙인다.
    // 배열 길이 정하는거까지 했음
    public static void main(String[] args) {

        Solution5 solution5 = new Solution5();
        solution5.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1,3},{0,4}});
    }
}

class Solution5 {
    public int[] solution(int[] arr, int[][] intervals) {
        int size = 0;
        int idx = 0;
        for(int i=0; i<intervals.length; i++){
            int copyStart = intervals[i][0];
            int copyEnd = intervals[i][1];
            for(int j=copyStart; j<=copyEnd; j++){
                size++;
            }
        }
        int[] answer = new int[size];
        for(int i=0; i<intervals.length; i++){
            int copyStart = intervals[i][0];
            int copyEnd = intervals[i][1];
            for(int j=copyStart; j<=copyEnd; j++){
                answer[idx++] = arr[j];
            }
        }

        return answer;
    }
}