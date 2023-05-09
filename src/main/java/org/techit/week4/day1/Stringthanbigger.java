package org.techit.week4.day1;

public class Stringthanbigger {

    Solution solution = new Solution();
    String a = "asdaq";
    char b= a.charAt(1);

}

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] biggerArr = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            biggerArr[i] = s.charAt(i);
        }
        for(int i=0; i<s.length()-1; i++){
            for(int j=0; j<s.length()-1; j++){
                if(biggerArr[j]<biggerArr[j+1]){
                    char bigger= biggerArr[j];
                    biggerArr[j] = biggerArr[j+1];
                    biggerArr[j+1] = bigger;
                }
            }
        }
        for(int i=0; i<biggerArr.length; i++){
            answer +=  Character.toString(biggerArr[i]);
        }
        return answer;
    }
}