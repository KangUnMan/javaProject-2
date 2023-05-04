package org.techit.week3.day4;

public class MinValue {
    public static void main(String[] args) {
        int[] maxvalue = {2 , 1, 3, 4, 7, 31};

        int min = maxvalue[0];

        for(int i=0; i<maxvalue.length; i++){
            if(min>maxvalue[i]) min = maxvalue[i];
        }
        System.out.printf("maxvalue 최소값: %d ",min);

    }
}
