package org.techit.Programmas;

class Solution {
    public int solution(int[] num_list)
    {   int oddNum = 0;
        int evenNum = 0;
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                evenNum *=10;
                evenNum +=num_list[i];
            }else{
                oddNum *=10;
                oddNum += num_list[i];
            }

        }
        answer = oddNum+evenNum;
        System.out.println(answer);
        return answer;
    }

}
public class NumPlus {
    public static void main(String[] args) {
        // arr를 리버스 or 반복문을 거꾸로
        //자릿수에 10^(n-1)하게 더함
        //자릿수를 구한 후 pow(10,자릿수)
        Solution solution = new Solution();
        solution.solution(new int[]{3, 4, 5, 2, 1});
    }
}
