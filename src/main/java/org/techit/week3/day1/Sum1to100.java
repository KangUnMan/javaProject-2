package org.techit.week3.day1;

public class Sum1to100 {

    void sumi(int m){
        int sum = 0 ;
        for (int i = 1; i <= m ; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Sum1to100 sumAll = new Sum1to100();
        sumAll.sumi(100);
    }
}
