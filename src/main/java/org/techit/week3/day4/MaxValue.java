package org.techit.week3.day4;

public class MaxValue {
    public static void main(String[] args) {
        int[] maxvalue = {2 , 1, 3, 4, 7, 31};

        int max = maxvalue[0];

        for(int i=0; i<maxvalue.length; i++){
            if(max<maxvalue[i]) max = maxvalue[i];
        }
        System.out.printf("maxvalue 최대값: %d ",max);

    }
}
