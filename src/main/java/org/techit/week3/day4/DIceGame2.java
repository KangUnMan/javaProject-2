package org.techit.week3.day4;

public class DIceGame2 {
    public static void main(String[] args) {

    }
}

class Solution1 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int cnt=0;
        if(a==b){
            cnt++;
        }
        if(b==c){
            cnt++;
        }
        if(c==a){
            cnt++;
        }
        switch (cnt){
            case 0 -> answer = a + b + c;
            case 1 -> answer = (a + b + c) * (a*a + b*b + c*c);
            case 3 -> answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        return answer;
    }
}