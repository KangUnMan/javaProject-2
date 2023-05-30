package org.techit.week7.day1;

public class ThreeSixNineGame {
    public static void main(String[] args) {
        int count = 3;
        int cnt = 0;
        while (count>0){
            if(count%3==0){
                cnt++;
            }
            cnt/=10;
        }
        System.out.println(cnt);
        String gameNum;
        for (int i = 0; i < 100; i++) {
            count = i % 10;
           if(count%3==0){
               cnt++;
           }
        }

    }
}
