package org.techit.Programmas;

public class SpecialTwoDimensionalArray {
    public static void main(String[] args) {
    Solution3 solution3 = new Solution3();
    solution3.solution(2);
    }
}

class Solution3 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==j){
                    answer[i][j]=1;
                }
            }
        }
        return answer;
    }
}