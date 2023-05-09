package org.techit.week4.day2;

public abstract class MaxMinDrawer {
    public void MaxOrMinValuePrint(int[] valueArr){
        int temp = valueArr[0];
        for(int i=0; i<valueArr.length; i++){
            temp = valueofThan(temp,valueArr[i]);
        }
        System.out.println(temp);
    }

    public abstract int valueofThan(int num1,int num2);
}
