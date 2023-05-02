package org.techit.week3.day2;

import java.time.LocalDateTime;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {

        int cnt = 0;
        while (cnt<11){
            System.out.println(cnt);
            Thread.sleep(1000);
            cnt++;
        }
    }
}
