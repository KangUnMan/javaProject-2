package org.techit.week4.day3;

public class Babbling {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
    }
}
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] ps = {"aya","ye","woo","ma"};
        for(int i=0; i< babbling.length; i++){
            for(int j=0; j<ps.length; j++){
               babbling[i]= babbling[i].replace(ps[j],"!");
            }
            if(babbling[i].replaceAll("!","").equals("")){
                answer++;
            }
        }

        return answer;
    }
}
